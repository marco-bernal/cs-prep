package com.mab.cs_prep.qualified.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mab.cs_prep.mocks.example.UserController;
import com.mab.cs_prep.mocks.example.UserServiceImpl;
import com.mab.cs_prep.mocks.example.exception.UserExceptionHandler;
import com.mab.cs_prep.mocks.example.exception.UserNotFoundException;
import com.mab.cs_prep.mocks.example.model.Address;
import com.mab.cs_prep.mocks.example.model.User;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import java.util.*;
import java.util.stream.Stream;

import static com.mab.cs_prep.mocks.example.util.UserFactory.*;
import static java.lang.String.format;
import static org.mockito.BDDMockito.given;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@ExtendWith(SpringExtension.class)
class UserControllerTest {

    private MockMvc mockMvc;

    @Mock
    private UserServiceImpl userServiceImpl;

    @BeforeEach
    void setUp() {
        mockMvc = standaloneSetup(
                new UserController(userServiceImpl))
                .setControllerAdvice(new UserExceptionHandler())
                .build();
    }

    @Test
    void shouldGetAllUsers() throws Exception {
        //given
        List<User> mockUsers = getMockUsers();
        when(userServiceImpl.getUsers()).thenReturn(mockUsers);

        //when
        ResultActions result = mockMvc.perform(get("/users")
                .contentType(MediaType.APPLICATION_JSON));

        //then
        result.andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(3)))
                .andExpect(jsonPath("$[0].name", is("Bob")))
                .andExpect(jsonPath("$[1].name", is("Christina")))
                .andExpect(jsonPath("$[2].name", is("Steve")));

        verify(userServiceImpl, times(1)).getUsers();
    }

    @Test
    void shouldReturnEmptyWhenThereAreNoUsers() throws Exception {
        //given
        List<User> emptyList = Collections.emptyList();
        when(userServiceImpl.getUsers()).thenReturn(emptyList);

        //when
        ResultActions result = mockMvc.perform(get("/users")
                .contentType(MediaType.APPLICATION_JSON));

        //then
        result.andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(0)));

        verify(userServiceImpl, times(1)).getUsers();
    }

    @Test
    void shouldGetUserByIdWhenExists() throws Exception {
        //given
        User mockUser = getMockUser();
        when(userServiceImpl.getById("72635")).thenReturn(mockUser);

        //when
        ResultActions result = mockMvc.perform(get("/user/{id}", "72635")
                .contentType(MediaType.APPLICATION_JSON));

        //then
        result.andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is("Josh")))
                .andExpect(jsonPath("$.age", is(41)));

        verify(userServiceImpl, times(1)).getById("72635");
    }

    @Test
    void shouldThrowUserNotFoundExceptionWhenUserIdDoesNotExist() throws Exception {
        //given
        String id = "93674367";
        String error = format("User with id: %1$s Not Found!", id);
        when(userServiceImpl.getById(id)).thenThrow(
                new UserNotFoundException(error));

        //when
        ResultActions result = mockMvc.perform(get("/user/{id}", id)
                .contentType(MediaType.APPLICATION_JSON));

        //then
        result.andExpect(status().isNotFound())
                .andExpect(r -> assertThat(r.getResolvedException() instanceof UserNotFoundException))
                .andExpect(r -> assertThat(error).isEqualTo(r.getResolvedException().getMessage()));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenIdPassedIsNotValid() throws Exception {
        //given
        int id = 873247;
        when(userServiceImpl.getById(anyString())).thenThrow(
                new IllegalArgumentException());

        //when
        ResultActions result = mockMvc.perform(get("/user/{id}", id)
                .contentType(MediaType.APPLICATION_JSON));

        //then
        result.andExpect(status().isBadRequest())
                .andExpect(r -> assertThat(r.getResolvedException() instanceof IllegalArgumentException));
    }

    @Test
    void shouldThrowExceptionWhenSearchingById() throws Exception {
        //given
        String id = "-967348";
        //given(someObj.someMethod(stringArg1)).willAnswer( invocation -> { throw new Exception("abc msg"); });
        given(userServiceImpl.getById(id)).willAnswer(i -> {
            throw new Exception();
        });

        //when(userServiceImpl.getById(id)).thenThrow(new Exception());

        //when
        ResultActions result = mockMvc.perform(get("/user/{id}", id)
                .contentType(MediaType.APPLICATION_JSON));

        //then
        result.andExpect(status().isInternalServerError())
                .andExpect(r -> assertThat(r.getResolvedException()).isNotNull());

    }

    @Test
    void shouldCreateNewWhenUserIsValid() throws Exception {
        //given
        User mockUser = getMockUser();
        when(userServiceImpl.createUser(any())).thenReturn(mockUser);

        //when
        ResultActions result = performPost(mockUser);

        //then
        result.andExpect(status().isCreated())
                .andExpect(jsonPath("$.name", is("Josh")))
                .andExpect(jsonPath("$.age", is(41)))
                .andExpect(jsonPath("$.address.number", is(67)))
                .andExpect(jsonPath("$.address.street", is("Auzerais Av")))
                .andExpect(jsonPath("$.address.city", is("San Jose")))
                .andExpect(jsonPath("$.address.state", is("CA")))
        ;

        verify(userServiceImpl, times(1)).createUser(any());
    }

    @MethodSource("getInvalidUsers")
    @ParameterizedTest(name = "Should throw bad request for the reason: {1}")
    void shouldThrowBadRequestWhenUserIsNotValid(User user) throws Exception {
        //when
        ResultActions result = performPost(user);

        //then
        result.andExpect(status().isBadRequest()
        );
    }

    private ResultActions performPost(User user) throws Exception {
        String jsonUser = new ObjectMapper().writeValueAsString(user);
        return mockMvc.perform(post("/user")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(jsonUser));
    }

    private static Stream<Arguments> getInvalidUsers() {
        return Stream.of(
                Arguments.of(getNewUser(new User("", 24, new Address())), "Empty name"),
                Arguments.of(getNewUser(new User("Cooper", 17, new Address())), "Age less than 18"),
                Arguments.of(getNewUser(new User("NoBody", 200, new Address())), "Age greater than 150")
        );
    }
}
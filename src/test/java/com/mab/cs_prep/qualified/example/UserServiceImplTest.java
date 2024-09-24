package com.mab.cs_prep.qualified.example;

import com.mab.cs_prep.mocks.example.UserRepository;
import com.mab.cs_prep.mocks.example.UserService;
import com.mab.cs_prep.mocks.example.UserServiceImpl;
import com.mab.cs_prep.mocks.example.exception.UserException;
import com.mab.cs_prep.mocks.example.exception.UserNotFoundException;
import com.mab.cs_prep.mocks.example.model.User;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import java.util.List;
import java.util.Optional;

import static com.mab.cs_prep.mocks.example.util.UserFactory.getMockUser;
import static com.mab.cs_prep.mocks.example.util.UserFactory.getMockUsers;
import static java.util.Collections.emptyList;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(SpringExtension.class)
class UserServiceImplTest {

    @Mock
    private UserRepository userRepository;

    private UserService userService;

    @BeforeEach
    void setUp() {
        userService = new UserServiceImpl(userRepository);
    }

    @Test
    void shouldGetAllUsersFromServiceLayer() {
        //given
        List<User> mockUsers = getMockUsers();
        when(userRepository.getUsers()).thenReturn(getMockUsers());

        //when
        List<User> users = userService.getUsers();

        //then
        assertThat(users).hasSize(3);
        assertThat(users)
                .extracting(User::getName)
                .containsExactly(mockUsers.get(0).getName(),
                        mockUsers.get(1).getName(),
                        mockUsers.get(2).getName()
                );

        verify(userRepository, times(1)).getUsers();

    }

    @Test
    void shouldReturnAnEmptyListWhenThereAreNoUsers() {
        //given
        List<User> emptyList = emptyList();
        when(userRepository.getUsers()).thenReturn(emptyList);

        //when
        List<User> users = userService.getUsers();

        //then
        assertThat(users).isEmpty();
        verify(userRepository, times(1)).getUsers();
    }

    @Test
    void shouldReturnUserWhenCreatedSuccessfully() {
        //given
        User mockUser = getMockUser();
        when(userRepository.createUser(mockUser)).thenReturn(mockUser);

        //when
        User user = userService.createUser(mockUser);

        //then
        assertThat(user.getName()).isEqualTo(mockUser.getName());
        assertThat(user.getAge()).isEqualTo(mockUser.getAge());
        verify(userRepository, times(1)).createUser(mockUser);
    }

    @Test
    void shouldThrowUserExceptionWhenUserFailsToCreate() {
        //given
        User user = new User();
        String error = "Error while creating a new user: User Must contain Name and Age";

        //when
        Throwable thrown = catchThrowable(
                () -> userService.createUser(user));

        assertThat(thrown)
                .isInstanceOf(UserException.class)
                .hasMessage(error);
    }

    @Test
    void shouldGetUserByIdWhenExists() {
        //given
        String id = "72635";
        Optional<User> mockUser = Optional.of(getMockUser());
        when(userRepository.getById(id)).thenReturn(mockUser);

        //when
        User user = userService.getById(id);

        //then
        assertThat(user.getName()).isEqualTo("Josh");
        assertThat(user.getAge()).isEqualTo(41);
        assertThat(user.getAddress().getNumber()).isEqualTo(67);
        assertThat(user.getAddress().getStreet()).isEqualTo("Auzerais Av");
        assertThat(user.getAddress().getCity()).isEqualTo("San Jose");
        assertThat(user.getAddress().getState()).isEqualTo("CA");

        verify(userRepository, times(1)).getById(id);
    }

    @Test
    void shouldThrowUserExceptionWhenUserByIdWhenDoesNotExists() {
        //given
        String id = "078234674728";
        String error = "User with id: 078234674728 Not Found!";

        //when
        UserNotFoundException userException = assertThrows(UserNotFoundException.class,
                () -> userService.getById(id));

        //then
        assertThat(userException.getMessage()).isEqualTo(error);
    }
}
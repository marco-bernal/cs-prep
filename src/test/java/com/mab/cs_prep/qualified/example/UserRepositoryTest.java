package com.mab.cs_prep.qualified.example;

import com.mab.cs_prep.mocks.example.UserRepository;
import com.mab.cs_prep.mocks.example.model.User;
import org.junit.jupiter.api.*;
import java.util.List;
import java.util.Optional;

import static com.mab.cs_prep.mocks.example.util.UserFactory.getMockUser;
import static com.mab.cs_prep.mocks.example.util.UserFactory.getMockUsers;
import static org.assertj.core.api.Assertions.assertThat;

class UserRepositoryTest {

    private UserRepository userRepository;

    @BeforeEach
    void setUp() {
        userRepository = new UserRepository();
    }

    @Test
    void shouldGetUsersFromRepository() {
        //given
        List<User> mockUsers = getMockUsers();

        //when
        List<User> users = userRepository.getUsers();

        //then
        assertThat(users).hasSize(3);

        assertThat(users)
                .extracting(User::getName)
                .containsExactly(
                        mockUsers.get(0).getName(),
                        mockUsers.get(1).getName(),
                        mockUsers.get(2).getName()
                );
    }

    @Test
    void shouldReturnEmptyUserListWhenThereAreNoUsers() {
        //given

        //when
        List<User> user = userRepository.getEmptyUsersList();

        //then
        assertThat(user).isEmpty();
    }

    @Test
    void shouldGetUserWhenSuccessfullyCreated() {
        //given
        User mockUser = getMockUser();

        //when
        User user = userRepository.createUser(mockUser);

        //then
        assertThat(user.getName()).isEqualTo("Josh");
        assertThat(user.getAge()).isEqualTo(41);
        assertThat(user.getAddress().getNumber()).isEqualTo(67);
        assertThat(user.getAddress().getStreet()).isEqualTo("Auzerais Av");
        assertThat(user.getAddress().getCity()).isEqualTo("San Jose");
        assertThat(user.getAddress().getState()).isEqualTo("CA");
    }

    @Test
    void shouldReturnUserWhenFindingByIdIsCorrect() {
        //given
        Optional<User> mockUser = Optional.of(getMockUser());
        String id = "72635";

        //when
        Optional<User> user = userRepository.getById(id);

        //then
        assertThat(user.get().getName()).isEqualTo(mockUser.get().getName());
        assertThat(user.get().getAge()).isEqualTo(mockUser.get().getAge());
    }

    @Test
    void shouldReturnEmptyWhenFindingByIdIsNotExistent() {
        //given
        String id = "124356";

        //when
        Optional<User> user = userRepository.getById(id);

        //then
        assertThat(user.isEmpty()).isTrue();
    }
}
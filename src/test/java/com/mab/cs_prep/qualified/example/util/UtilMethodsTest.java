package com.mab.cs_prep.qualified.example.util;

import com.mab.cs_prep.mocks.example.model.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.mab.cs_prep.mocks.example.util.UserFactory.getMockUsers;
import static com.mab.cs_prep.mocks.example.util.UtilMethods.getUsersByCityAsc;
import static org.assertj.core.api.Assertions.assertThat;

class UtilMethodsTest {

    @Test
    void shouldGetUsersByCityAsc() {
        //given
        List<User> unsortedUsers = getMockUsers();

        //when
        List<User> sortedUsers = getUsersByCityAsc(unsortedUsers);

        //then
        assertThat(sortedUsers).hasSize(3);
        assertThat(sortedUsers).extracting(User::getName)
                .containsExactly("Steve", "Christina", "Bob");
    }
    //TODO: Add tests
    @Test
    void shouldGetUsersByAgeGreaterThan30() {
    }

    @Test
    void shouldGetAllUserStatesAsc() {
    }

    @Test
    void shouldGetOlderUser() {
    }

    @Test
    void shouldGetUserByName() {
    }
}
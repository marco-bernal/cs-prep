package com.mab.cs_prep.mocks.example;

import com.mab.cs_prep.mocks.example.model.User;
import com.mab.cs_prep.mocks.example.util.UserFactory;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Component
public class UserRepository {

    List<User> getUsers() {
        return UserFactory.getMockUsers();
    }

    List<User> getEmptyUsersList() {
        return Collections.emptyList();
    }

    User createUser(User user) {
        return UserFactory.getNewUser(user);
    }

    Optional<User> getById(String id) {
        Optional<User> userOptional;

        if (id.equals("72635")) {
            userOptional = Optional.of(UserFactory.getMockUser());
        } else {
            userOptional = Optional.empty();
        }
        return userOptional;
    }
}

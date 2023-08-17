package com.mab.mocks.qualified.example;

import com.mab.mocks.qualified.example.model.User;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static com.mab.mocks.qualified.example.util.UserFactory.*;

@Component
public class UserRepository {

    List<User> getUsers() {
        return getMockUsers();
    }

    List<User> getEmptyUsersList() {
        return Collections.emptyList();
    }

    User createUser(User user) {
        return getNewUser(user);
    }

    Optional<User> getById(String id) {
        Optional<User> userOptional;

        if (id.equals("72635")) {
            userOptional = Optional.of(getMockUser());
        } else {
            userOptional = Optional.empty();
        }
        return userOptional;
    }
}

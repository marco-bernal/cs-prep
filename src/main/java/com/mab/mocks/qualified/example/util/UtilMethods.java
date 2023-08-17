package com.mab.mocks.qualified.example.util;


import com.mab.mocks.qualified.example.model.User;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Class for sorting, filtering and perform operations on a User Collection
**/

public class UtilMethods {

    private UtilMethods() {}

    // Add static methods, hard to test, but using a wrapper could be a workaround,
    // or using specific libraries to mock'em

    static List<User> getUsersByCityAsc(List<User> users) {
        return users.stream()
                .sorted(Comparator.comparing(u -> u.getAddress().getCity()))
                .collect(Collectors.toList());
    }

    static List<User> getUsersByAgeGreaterThan30(List<User> users) {
        return users.stream()
                .filter(u -> u.getAge() > 30)
                .collect(Collectors.toList());
    }

    static List<String> getAllUserStatesAsc(List<User> users) {
        return users.stream()
                .sorted(Comparator.comparing(u -> u.getAddress().getState()))
                .map(u -> u.getAddress().getState())
                .collect(Collectors.toList());
    }

    static Optional<User> getOlderUser(List<User> users) {
        return users.stream()
                .max(Comparator.comparingInt(User::getAge));
    }

    static Optional<User> getUserByName(List<User> users, String name) {
        return users.stream()
                .filter(u -> u.getName().equalsIgnoreCase(name))
                .findAny();
    }
}

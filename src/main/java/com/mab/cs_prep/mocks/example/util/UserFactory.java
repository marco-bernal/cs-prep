package com.mab.cs_prep.mocks.example.util;



import com.mab.cs_prep.mocks.example.model.Address;
import com.mab.cs_prep.mocks.example.model.User;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

//TODO: Randomize the user name order and sort it using Comparable in the service layer
public class UserFactory {

    private UserFactory() {
    }

    public static List<User> getMockUsers() {
        return Stream.of(
                new User("Bob", 45, new Address(134, "Canyon Village", "San Ramon", "CA")),
                new User("Christina", 39, new Address(61, "Hillsdale blvd", "San Mateo", "CA")),
                new User("Steve", 31, new Address(131, "10th street north", "San Jose", "CA"))
        ).collect(toList());
    }

    public static User getMockUser() {
        return new User("Josh", 41, new Address(67, "Auzerais Av", "San Jose", "CA"));
    }

    public static User getNewUser(User user) {
        return new User(user.getName(), user.getAge(),
                new Address(user.getAddress().getNumber(),
                        user.getAddress().getStreet(),
                        user.getAddress().getCity(),
                        user.getAddress().getState()
                )
        );
    }
}

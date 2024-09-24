package com.mab.cs_prep.mocks.example;


import com.mab.cs_prep.mocks.example.model.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    User createUser(User user);

    User getById(String id);
}

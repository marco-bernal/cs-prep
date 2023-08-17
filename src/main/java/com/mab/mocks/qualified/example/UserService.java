package com.mab.mocks.qualified.example;


import com.mab.mocks.qualified.example.model.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    User createUser(User user);

    User getById(String id);
}

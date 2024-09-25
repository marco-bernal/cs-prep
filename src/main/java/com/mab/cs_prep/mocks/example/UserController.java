package com.mab.cs_prep.mocks.example;

import com.mab.cs_prep.mocks.example.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

//import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {

    private final UserServiceImpl service;

    public UserController(UserServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return service.getUsers();
    }

    @PostMapping("/user")
    @ResponseStatus(HttpStatus.CREATED)
    //public User createUser(@RequestBody @Valid User user) {
    public User createUser(@RequestBody User user) {
        return service.createUser(user);
    }

    @GetMapping("user/{id}")
    public User getById(@PathVariable("id") String id) {
        return service.getById(id);
    }
}
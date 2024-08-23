package com.mab.mocks.qualified.example;

import com.mab.mocks.qualified.example.exception.UserException;
import com.mab.mocks.qualified.example.exception.UserNotFoundException;
import com.mab.mocks.qualified.example.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

import static java.lang.String.format;

//TODO; De;ete interface, since there's only one implementation. Rename service class.
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getUsers() {
        return userRepository.getUsers();
    }

    @Override
    public User createUser(User user) {

        if (Objects.nonNull(user.getName())
                && Objects.nonNull(user.getAge())) {
            return userRepository.createUser(user);

        } else {
            throw new UserException("Error while creating a new user: User Must contain Name and Age");
        }
    }

    @Override
    public User getById(String id) {
        return userRepository.getById(id).orElseThrow(
                () -> new UserNotFoundException(format("User with id: %1$s Not Found!", id)));
    }
}

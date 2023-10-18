package com.cumulus.server.serviceapi;

import com.cumulus.server.model.User;

public interface UserService {
    User createUser(User user);

    // User getUserById(Long userId);

    Iterable<User> getAllUsers();

    // User updateUser(User user);

    // void deleteUser(Long userId);
}
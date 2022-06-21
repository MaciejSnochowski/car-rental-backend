package com.pk.carRental.service;

import com.pk.carRental.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    List<User> getUser(Long id);
    void deleteUser(Long id);
}


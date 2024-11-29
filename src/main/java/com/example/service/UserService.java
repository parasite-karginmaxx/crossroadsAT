package com.example.service;

import java.util.List;

import com.example.model.User;

public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUsers();
}

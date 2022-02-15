package com.example.SpringBootCrud.service;

import com.example.SpringBootCrud.model.User;

import java.util.List;

public interface Service<T> {
    void addUser(T t);

    User getUser(long id);

    List<User> getAllUsers();

    void updateUser(T t);

    void deleteUser(long id);
}

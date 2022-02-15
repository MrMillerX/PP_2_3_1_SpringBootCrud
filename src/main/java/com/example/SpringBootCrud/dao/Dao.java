package com.example.SpringBootCrud.dao;

import com.example.SpringBootCrud.model.User;

import java.util.List;

public interface Dao<T> {
    void add(T t);

    User get(long id);

    List<T> getAll();

    void update(T t);

    void delete(long id);
}

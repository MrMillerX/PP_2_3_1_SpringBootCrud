package com.example.SpringBootCrud.service;

import com.example.SpringBootCrud.dao.Dao;
import com.example.SpringBootCrud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@org.springframework.stereotype.Service
public class UserServiceImpl implements Service<User> {

    private final Dao<User> userDao;

    @Autowired
    public UserServiceImpl(Dao<User> userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public void addUser(User user) {
        userDao.add(user);
    }

    @Transactional(readOnly = true)
    @Override
    public User getUser(long id) {
        return userDao.get(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getAllUsers() {
        return userDao.getAll();
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        userDao.update(user);
    }

    @Transactional
    @Override
    public void deleteUser(long id) {
        userDao.delete(id);
    }
}

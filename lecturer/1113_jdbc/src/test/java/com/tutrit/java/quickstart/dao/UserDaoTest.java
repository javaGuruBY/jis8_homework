package com.tutrit.java.quickstart.dao;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoTest {

    @Test
    public void findAll() {
        UserDao userDao = new UserDao();
        userDao.findAll();
    }
}
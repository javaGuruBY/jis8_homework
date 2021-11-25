package com.tutrit.java.quickstart.dao;

import com.tutrit.java.quickstart.bean.User;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class UserDaoTest {

    @Test
    public void findAll() {
        UserDao userDao = new UserDao();
        userDao.findAll();
    }

    @Test
    public void findById() {
        UserDao userDao = new UserDao();
        User user = userDao.findById(10).get();
        assertEquals(Integer.valueOf(10), user.getId());
    }

    @Test
    public void findByIdOnPreparedSt() {
        UserDao userDao = new UserDao();
        User user = userDao.findByIdOnPreparedSt(10).get();
        assertEquals(Integer.valueOf(10), user.getId());
    }

    @Test(expected = SQLException.class)
    public void findByIdSqlInjected() {
        UserDao userDao = new UserDao();
        User user = userDao.findByIdForSqlInjection("10 or 1=1").get();
        User user2 = userDao.findByIdForSqlInjection("10 or true").get();
    }

    @Test(expected = SQLException.class)
    public void findByIdSqlInjectedDropTable() {
        UserDao userDao = new UserDao();
        User user = userDao.findByIdForSqlInjection("10; DROP TABLE user;").get();
        assertEquals(Integer.valueOf(10), user.getId());
    }

    @Test()
    public void authenticateForSqlInjection() {
        UserDao userDao = new UserDao();
        String result = userDao.authenticateForSqlInjection("'' or ''=''", "'' or ''=''");
        assertEquals("User Authenticated! Logged as '' or ''=''", result);
    }

    @Test(expected = SQLException.class)
    public void findByIdPreparedStSqlInjected() {
        UserDao userDao = new UserDao();
        User user = userDao.findByIdOnPreparedStSqlInjection("10 or 1=1").get();
        Optional<User> user2 = userDao.findByIdOnPreparedStSqlInjection("10000 or true");
        assertEquals(Integer.valueOf(10), user.getId());
        assertTrue(user2.isEmpty());
    }

    @Test
    public void batchUpdateUser() {
        UserDao userDao = new UserDao();
        int[] result = userDao.batchUpdateUser(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    @Test
    public void findAllAsCall() {
        UserDao userDao = new UserDao();
        userDao.findAllAsCall();
    }

    @Test
    public void transactionalExecution() {
        UserDao userDao = new UserDao();
        userDao.transactionalExecution("M");
    }
}
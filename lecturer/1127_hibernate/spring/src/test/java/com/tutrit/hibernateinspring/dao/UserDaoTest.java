package com.tutrit.hibernateinspring.dao;

import com.tutrit.hibernateinspring.bean.Student;
import com.tutrit.hibernateinspring.bean.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import javax.transaction.Transactional;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserDaoTest {

    @Autowired
    UserDao userDao;

    @Test
    @Transactional
    @Sql("/userDaoTestData.sql")
    void findAllUsers() {
        List<User> result = userDao.findAll();
        assertTrue(result.size() == 1);
    }
}
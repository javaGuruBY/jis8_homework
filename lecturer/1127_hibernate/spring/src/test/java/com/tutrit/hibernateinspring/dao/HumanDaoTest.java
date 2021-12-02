package com.tutrit.hibernateinspring.dao;

import com.tutrit.hibernateinspring.bean.Human;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HumanDaoTest {

    @Autowired
    HumanDao humanDao;

    @Test
    void save() {
        Human human = new Human(null, "Mikas");
        humanDao.save(human);
    }

    @Test
    void findAll() {
        Human human = new Human(null, "Mikas");
        humanDao.save(human);
    }
}
package com.tutrit.hibernateinspring.dao;

import com.tutrit.hibernateinspring.bean.Human;
import com.tutrit.hibernateinspring.bean.Mentor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MentorDaoTest {

    @Autowired
    MentorDao mentorDao;

    @Test
    void save() {
        Mentor mentor = new Mentor(new Double(100));
        mentorDao.save(mentor);
    }
}
package com.tutrit.hibernateinspring.dao;

import com.tutrit.hibernateinspring.bean.Human;
import com.tutrit.hibernateinspring.bean.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentDaoTest {

    @Autowired
    StudentDao studentDao;

    @Test
    void save() {
        Student student = new Student("https://github.com/student");
        studentDao.save(student);
    }
}
package com.tutrit.hibernateinspring.dao;

import com.tutrit.hibernateinspring.bean.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import javax.transaction.Transactional;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class StudentDaoTest {

    @Autowired
    StudentDao studentDao;

    @Test
    void save() {
        Student student = new Student("https://github.com/student");
        studentDao.save(student);
    }

    @Test
    @Transactional
    @Sql("/findAll.sql")
    void findAll() {
        List<Student> result = studentDao.findAll();
        assertNotNull(result);
    }

    @Test
    @Transactional
    @Sql("/findAll.sql")
    void findStudentById() {
        List<Student> result = studentDao.findAll();
        assertNotNull(result);
    }

    @Test
    void testSave() {
        List<Student> students = List.of(
                new Student("https://github.com/student1"),
                new Student("https://github.com/student2"));
        studentDao.save(students);
    }
}
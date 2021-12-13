package com.tutrit.hibernateinspring.dao.em;

import com.tutrit.hibernateinspring.bean.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentDaoTest {

    @Autowired
    StudentDao studentDao;

    @Test
    @Transactional
    void save() {
        Student student = Student.builder()
                .gitHub("http://student test")
                .build();
        Long id = studentDao.save(student);

        Student persistStudent = studentDao.findById(id);
        assertEquals("http://student test", persistStudent.getGitHub());
    }

    @Test
    @Transactional
    void update() {
        Student student = Student.builder()
                .gitHub("http://updated")
                .studentId(3L)
                .build();
        studentDao.update(student);

        Student persistStudent = studentDao.findById(3L);
        assertEquals("http://updated", persistStudent.getGitHub());
    }

    @Test
    void findById() {
        Long id = 10L;
        Student student = studentDao.findById(id);
        assertEquals("https://github.com/student10", student.getGitHub());
    }

    @Test
    @Transactional
    void delete() {
        Student student = Student.builder()
                .studentId(3L)
                .build();
        studentDao.delete(student);
        Student student2 = studentDao.findById(2L);
        Student student3 = studentDao.findById(3L);
        assertNotNull(student2);
        assertNull(student3);
    }
}
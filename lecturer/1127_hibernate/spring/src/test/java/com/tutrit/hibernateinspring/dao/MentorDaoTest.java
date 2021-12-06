package com.tutrit.hibernateinspring.dao;

import com.tutrit.hibernateinspring.bean.Alumnus;
import com.tutrit.hibernateinspring.bean.Human;
import com.tutrit.hibernateinspring.bean.Mentor;
import com.tutrit.hibernateinspring.bean.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Set;

@SpringBootTest
class MentorDaoTest {

    @Autowired
    MentorDao mentorDao;

    @Test
    void save() {
        Mentor mentor = new Mentor(new Double(100));
        mentorDao.save(mentor);
    }

    @Test
    void saveWithStudents() {
        List<Student> students = List.of(
                new Student("https://github.com/student3"),
                new Student("https://github.com/student4"));
        Mentor mentor = new Mentor(new Double(100));
        mentor.setStudent(students);
        mentorDao.save(mentor);
    }

    @Test
    void saveWithAlumni() {
        List<Alumnus> alumni = List.of(
                new Alumnus(true),
                new Alumnus(false));
        Mentor mentor = new Mentor(new Double(100));
        mentor.setAlumnusList(alumni);
        mentorDao.save(mentor);
    }
}
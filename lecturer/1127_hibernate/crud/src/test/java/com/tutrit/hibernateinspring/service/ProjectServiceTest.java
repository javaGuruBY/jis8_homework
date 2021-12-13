package com.tutrit.hibernateinspring.service;

import com.tutrit.hibernateinspring.bean.Alumnus;
import com.tutrit.hibernateinspring.bean.Mentor;
import com.tutrit.hibernateinspring.bean.Project;
import com.tutrit.hibernateinspring.bean.Student;
import org.hibernate.LazyInitializationException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProjectServiceTest {

    @Autowired
    ProjectService projectService;

    @Test
    void findAll() {
        List<Project> actualResult = projectService.findAll();
        assertEquals(3, actualResult.size());
    }

    @Test
    void findByMentor() {
        Mentor mentor = new Mentor();
        mentor.setMentorId(1L);
        Project actualResult = projectService.findByMentor(mentor);
        assertEquals(1, actualResult.getProjectId());
    }

    @Test
    void findAlumnusWithProjectBy() {
        Mentor mentor = new Mentor();
        mentor.setMentorId(1L);
        List<Alumnus> alumnusList = projectService.findAlumnusWithProjectBy(mentor);
        assertEquals(3, alumnusList.size());
    }

    @Test
    void findStudentsWithProjectBy() {
        Mentor mentor = new Mentor();
        mentor.setMentorId(1L);
        LazyInitializationException ex = assertThrows(
                LazyInitializationException.class,
                () -> projectService.findStudentsWithProjectBy(mentor).size(), //try to remove size() - test will fail
                "Expected projectService.findStudentsWithProjectBy(mentor) " +
                        "to throw lazy initialization exception on Students collection, but it didn't"
        );
        assertTrue(ex.getMessage().contains("failed to lazily initialize a collection of role: com.tutrit.hibernateinspring.bean.Project.studentsOnProject, could not initialize proxy - no Session"));
    }

    @Test
    void inOneTransactionFindStudentsWithProjectWhenStudentsLazyBy() {
        Mentor mentor = new Mentor();
        mentor.setMentorId(1L);
        List<Student> students = projectService.inOneTransactionFindStudentsWithProjectWhenStudentsLazyBy(mentor);
        assertEquals(2, students.size());
    }

    @Test
    void findStudentsWithProjectWhenStudentsLazyBy() {
        List<Student> students = projectService.findStudentsWithProjectWhenStudentsLazyBy(1L);
        assertEquals(2, students.size());
    }
}
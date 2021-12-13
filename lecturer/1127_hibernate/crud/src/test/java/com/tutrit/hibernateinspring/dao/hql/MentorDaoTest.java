package com.tutrit.hibernateinspring.dao.hql;

import com.tutrit.hibernateinspring.bean.Mentor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import javax.persistence.NoResultException;
import javax.transaction.Transactional;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MentorDaoTest {

    @Autowired
    MentorDaoHql mentorDao;

    @Test
    @Transactional
    void save() {
        Mentor mentor = Mentor.builder()
                .fullName("Vsl Blr")
                .build();
        Long mentorId = mentorDao.save(mentor);

        Mentor persistentMentor = mentorDao.findById(mentorId);
        assertEquals("Vsl Blr", persistentMentor.getFullName());
    }

    @Test
    void findById() {
        Mentor mentor = mentorDao.findById(3L);
        assertEquals("Irina", mentor.getFullName());
    }

    @Test
    void findAll() {
        List<Mentor> mentors = mentorDao.findAll();
        assertEquals(3, mentors.size());
    }

    @Test
    void update() {
        Mentor mentor = Mentor.builder()
                .mentorId(1L)
                .fullName("Vsl Blr")
                .build();
        mentorDao.update(mentor);
    }

    @Test
    @Sql("/deleteMentorTest.sql")
    @Transactional
    void delete() {
        assertNotNull(mentorDao.findById(101L));

        Mentor mentor = Mentor.builder()
                .mentorId(101L)
                .build();
        mentorDao.delete(mentor);
        
        NoResultException ex = assertThrows(
                NoResultException.class,
                () -> mentorDao.findById(101L),
                "Expected mentor entity to be deleted, but it not"
        );
        assertTrue(ex.getMessage().contains("No entity found for query"));

    }
}
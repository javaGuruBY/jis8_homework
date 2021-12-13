package com.tutrit.hibernateinspring.dao.sprdata;

import com.tutrit.hibernateinspring.bean.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class AlumnusRepositoryTest {

    @Autowired
    AlumnusRepository alumnusRepository;

    @Test
    void findAll() {
        List<Alumnus> alumni = alumnusRepository.findAll();
        assertEquals(10, alumni.size());
    }

    @Test
    void findById() {
        Optional<Alumnus> alumnus = alumnusRepository.findById(3L);
        assertEquals("Alumnus 3", alumnus.get().getName());
    }

    @Test
    @Transactional
    void update() {
        Alumnus alumnus = new Alumnus();
        alumnus.setName("updated");
        alumnus.setAlumnusId(3L);
        alumnusRepository.save(alumnus);

        Optional<Alumnus> alumnusUpdated = alumnusRepository.findById(3L);
        assertEquals("updated", alumnusUpdated.get().getName());
    }

    @Test
    @Transactional
    void save() {
        Alumnus alumnus = new Alumnus();
        alumnus.setPrimarySkill(PrimarySkill.JAVA);
        alumnus.setName("Alexandr 2lai");
        Alumnus persistedAlumnus = alumnusRepository.save(alumnus);

        assertEquals(persistedAlumnus, alumnusRepository.getById(persistedAlumnus.getAlumnusId()));
        assertTrue(alumnusRepository.findById(persistedAlumnus.getAlumnusId()).isPresent());
    }

    @Test
    @Transactional
    void delete() {
        Alumnus alumnus = new Alumnus();
        alumnus.setAlumnusId(10L);
        alumnusRepository.delete(alumnus);

        assertTrue(alumnusRepository.findById(10L).isEmpty());
    }

    @Test
    void pagedAndSorted() {
        Pageable pagedAndSorted =
                PageRequest.of(1, 3, Sort.by(Alumnus.Fields.name).descending());
        Page<Alumnus> alumniPage = alumnusRepository.findAll(pagedAndSorted);
        List<Alumnus> alumni = alumniPage.getContent();
        assertEquals(3, alumni.size());
        assertEquals("Alumnus 6", alumni.get(0).getName());
    }

    @Test
    void findByHiredAndMentor() {
        Mentor mentor = new Mentor();
        mentor.setMentorId(1L);
        List<Alumnus> alumni = alumnusRepository.findAllByHiredIsFalseAndMentor(mentor);
        assertEquals(4, alumni.size());
    }

    @Test
    void findOnlyHired() {
        List<AlumnusHiredProjection> onlyHired = alumnusRepository.findOnlyHired();
        assertEquals(6, onlyHired.size());
    }

    @Test
    void findOnlyHiredByName() {
        List<Alumnus> onlyHired = alumnusRepository.findOnlyHiredByName("Alumnus 1");
        assertEquals("Alumnus 1", onlyHired.get(0).getName());
        assertEquals(true, onlyHired.get(0).isHired());
    }

    @Test
    void findOnlyHiredInfo() {
        List<AlumnusHiredDto> onlyHired = alumnusRepository.findOnlyHiredInfo();
        assertEquals(6, onlyHired.size());
    }

    @Test
    void testFindAllWithSpecifications() {
        List<Alumnus> alumni = alumnusRepository.findAll(Specification.where(AlumnusSpecifications.isHired()));
        assertEquals(6, alumni.size());

        alumni = alumnusRepository.findAll(Specification.where(AlumnusSpecifications.nameIs("Alumnus 4")));
        assertEquals(1, alumni.size());
        assertEquals("Alumnus 4", alumni.get(0).getName());

        alumni = alumnusRepository.findAll(Specification.where(
                AlumnusSpecifications.nameIs("Alumnus 4")
                        .and(AlumnusSpecifications.isHired())));
        assertEquals(1, alumni.size());
        assertEquals("Alumnus 4", alumni.get(0).getName());

        alumni = alumnusRepository.findAll(Specification.where(
                AlumnusSpecifications.nameIs("Alumnus 2")
                        .and(AlumnusSpecifications.isHired())));
        assertEquals(0, alumni.size());
    }

}
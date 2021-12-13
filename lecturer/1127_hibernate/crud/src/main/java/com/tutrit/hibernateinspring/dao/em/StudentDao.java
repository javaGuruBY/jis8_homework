package com.tutrit.hibernateinspring.dao.em;

import com.tutrit.hibernateinspring.bean.Student;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Component
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class StudentDao {

    EntityManager em;

    @Transactional
    public Long save(Student student) {
        em.persist(student);
        return student.getStudentId();
    }

    @Transactional
    public void update(Student student) {
        em.merge(student);
    }

    @Transactional
    public Student findById(Long id) {
        return em.find(Student.class, id);
    }

    @Transactional
    public void delete(Student student) {
        student = em.find(Student.class, student.getStudentId());
        em.remove(student);
    }
}

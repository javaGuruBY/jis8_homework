package com.tutrit.hibernateinspring.dao;

import com.tutrit.hibernateinspring.bean.Student;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.Session;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Component
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class StudentDao {

    EntityManager entityManager;

    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    public List<Student> findAll() {
        return getSession()
                .createQuery("from Student", Student.class)
                .getResultList();
    }

    @Transactional
    public void save(List<Student> students) {
        students.stream().forEach(student -> entityManager.persist(student));
    }

    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
}

package com.tutrit.hibernateinspring.dao;

import com.tutrit.hibernateinspring.bean.Alumnus;
import com.tutrit.hibernateinspring.bean.Human;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Component
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AlumnusDao {

    EntityManager entityManager;

    @Transactional
    public void save(Alumnus alumnus) {
        entityManager.persist(alumnus);
        entityManager.persist(alumnus.getAlumnusPIIData());
        alumnus.getMentorList().forEach(mentor -> entityManager.persist(mentor));
    }

    @Transactional
    public void saveAll(List<Alumnus> alumni) {
        alumni.forEach(alumnus -> entityManager.persist(alumnus));
        alumni.forEach(alumnus -> entityManager.persist(alumnus.getAlumnusPIIData()));
        alumni.forEach(alumnus -> alumnus.getMentorList().forEach(mentor -> entityManager.persist(mentor)));
    }

    @Transactional
    public List<Alumnus> findAll() {
        Session session = getSession();
        List<Alumnus> alumnus = session.createQuery("from Alumnus").getResultList();
        return alumnus;
    }

    @Transactional
    public void delete(Alumnus alumnus) {
        Session session = getSession();
        Query query = session.createQuery("delete from Alumnus a where a.id = :id");
        query.setParameter("id", alumnus.getId());
        query.executeUpdate();
    }

    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
}

package com.tutrit.hibernateinspring.dao;

import com.tutrit.hibernateinspring.bean.Alumnus;
import com.tutrit.hibernateinspring.bean.AlumnusPIIData;
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
public class AlumnusPIIDataDao {

    EntityManager entityManager;

    @Transactional
    public void save(AlumnusPIIData alumnusPIIData) {
        entityManager.persist(alumnusPIIData);
    }

    @Transactional
    public List<AlumnusPIIData> findAll() {
        Session session = getSession();
        List<AlumnusPIIData> alumnusPIIData = session.createQuery("from AlumnusPIIData").getResultList();
        return alumnusPIIData;
    }

    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
}

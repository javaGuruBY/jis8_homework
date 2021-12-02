package com.tutrit.hibernateinspring.dao;

import com.tutrit.hibernateinspring.bean.Alumnus;
import com.tutrit.hibernateinspring.bean.Human;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Component
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AlumnusDao {

    EntityManager entityManager;

    @Transactional
    public void save(Alumnus alumnus) {
        entityManager.persist(alumnus.getAlumnusPIIData());
        entityManager.persist(alumnus);
    }
}

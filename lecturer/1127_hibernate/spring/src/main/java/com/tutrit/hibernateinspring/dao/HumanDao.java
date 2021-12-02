package com.tutrit.hibernateinspring.dao;

import com.tutrit.hibernateinspring.bean.Human;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Component
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class HumanDao {

    EntityManager entityManager;

    @Transactional
    public void save(Human human) {
        entityManager.persist(human);
    }
}

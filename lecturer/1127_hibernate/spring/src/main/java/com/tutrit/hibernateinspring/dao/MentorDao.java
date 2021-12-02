package com.tutrit.hibernateinspring.dao;

import com.tutrit.hibernateinspring.bean.Human;
import com.tutrit.hibernateinspring.bean.Mentor;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Component
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class MentorDao {

    EntityManager entityManager;

    @Transactional
    public void save(Mentor mentor) {
        entityManager.persist(mentor);
    }
}

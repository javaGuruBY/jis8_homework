package com.tutrit.hibernateinspring.dao;

import com.tutrit.hibernateinspring.bean.Student;
import com.tutrit.hibernateinspring.bean.User;
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
public class UserDao {

    EntityManager entityManager;

    @Transactional
    public void save(User user) {
        entityManager.persist(user);
    }

    @Transactional(readOnly = true)
    public List<User> findAll() {
        return getSession()
                .createQuery("from User", User.class)
                .getResultList();
    }

    @Transactional
    public void save(List<User> users) {
        users.stream().forEach(student -> entityManager.persist(users));
    }

    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
}

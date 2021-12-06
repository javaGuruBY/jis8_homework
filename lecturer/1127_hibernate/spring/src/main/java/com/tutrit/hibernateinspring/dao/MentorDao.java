package com.tutrit.hibernateinspring.dao;

import com.tutrit.hibernateinspring.bean.Alumnus;
import com.tutrit.hibernateinspring.bean.Human;
import com.tutrit.hibernateinspring.bean.Mentor;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Component
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class MentorDao {

    EntityManager entityManager;

    @Transactional
    public void save(Mentor mentor) {
        entityManager.persist(mentor);
        mentor.getAlumnusList().forEach(alumnus -> entityManager.persist(alumnus));
    }

    @Transactional
    public void saveAll(List<Mentor> mentorList) {
        mentorList.forEach(mentor -> entityManager.persist(mentor));
        mentorList.forEach(mentor -> mentor.getAlumnusList().forEach(alumnus -> entityManager.persist(alumnus)));
    }
}

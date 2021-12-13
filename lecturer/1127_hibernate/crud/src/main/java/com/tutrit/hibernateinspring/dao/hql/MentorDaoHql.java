package com.tutrit.hibernateinspring.dao.hql;

import com.tutrit.hibernateinspring.bean.Mentor;
import com.tutrit.hibernateinspring.bean.Student;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.Session;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class MentorDaoHql {

    EntityManager em;

    @Transactional
    public Long save(Mentor mentor) {
        session().save(mentor);
        return mentor.getMentorId();
    }

    @Transactional
    public void update(Mentor mentor) {
        Query query = em.createQuery("update Mentor m set m.fullName = :fullname where m.mentorId = :mentorId");
        query.setParameter("mentorId", mentor.getMentorId());
        query.setParameter("fullname", mentor.getFullName());
        query.executeUpdate();
    }


    @Transactional
    public Mentor findById(Long mentorId) {
        TypedQuery<Mentor> query = session().createQuery("from Mentor m where m.mentorId = :mentorId", Mentor.class);
        query.setParameter("mentorId", mentorId);
        Mentor mentor = query.getSingleResult();
        return mentor;
    }

    @Transactional
    public List<Mentor> findAll() {
        TypedQuery<Mentor> query = session().createQuery("from Mentor", Mentor.class);
        List<Mentor> mentorList = query.getResultList();
        return mentorList;
    }

    @Transactional
    public void delete(Mentor mentor) {
        Query query = em.createQuery("delete from Mentor m where m.mentorId = :mentorId");
        query.setParameter("mentorId", mentor.getMentorId());
        query.executeUpdate();
    }

    private Session session() {
        return em.unwrap(Session.class);
    }
}

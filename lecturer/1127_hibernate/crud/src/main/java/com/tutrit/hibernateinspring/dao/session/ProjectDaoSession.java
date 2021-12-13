package com.tutrit.hibernateinspring.dao.session;

import com.tutrit.hibernateinspring.bean.Mentor;
import com.tutrit.hibernateinspring.bean.Project;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Component
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProjectDaoSession {

    EntityManager em;

    @Transactional
    public Project findByMentor(Mentor mentor) {
        Query<Project> query = session().createQuery("from Project pr left join fetch pr.studentsOnProject st where pr.mentorOnProject = ?1", Project.class);
        Project project = query.setParameter(1, mentor).getSingleResult();
        return project;
    }

    private Session session() {
        return em.unwrap(Session.class);
    }
}

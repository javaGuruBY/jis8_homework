package com.tutrit.hibernateinspring.dao.em;

import com.tutrit.hibernateinspring.bean.Mentor;
import com.tutrit.hibernateinspring.bean.Project;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Component
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProjectDao {

    EntityManager em;

    @Transactional
    public void saveProject(Project project) {
    }

    @Transactional
    public List<Project> findAll() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Project> cq = cb.createQuery(Project.class);
        Root<Project> rootEntry = cq.from(Project.class);
        CriteriaQuery<Project> all = cq.select(rootEntry);
        TypedQuery<Project> allQuery = em.createQuery(all);
        return allQuery.getResultList();
    }

    @Transactional
    public Project findByMentor(Mentor mentor) {
        TypedQuery<Project> query = em.createQuery("from Project where mentor_id = ?1", Project.class);
        Project project = query.setParameter(1, mentor.getMentorId()).getSingleResult();
        return project;
    }
}

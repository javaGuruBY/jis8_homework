package com.tutrit.hibernateinspring.dao.criteria;

import com.tutrit.hibernateinspring.bean.Alumnus;
import com.tutrit.hibernateinspring.bean.Mentor;
import com.tutrit.hibernateinspring.bean.Project;
import com.tutrit.hibernateinspring.bean.Student;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import java.util.List;

@Component
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProjectDaoCriteria {

    EntityManager em;

    @Transactional
    public List<Project> findAll() {
        CriteriaBuilder criteriaBuilder = session().getCriteriaBuilder();
        CriteriaQuery<Project> criteriaQuery = criteriaBuilder.createQuery(Project.class);
        Root<Project> root = criteriaQuery.from(Project.class);

        criteriaQuery.orderBy(criteriaBuilder.desc(root.get("projectId")));
        criteriaQuery.select(root);

        Query<Project> query = session().createQuery(criteriaQuery);
        List<Project> projects = query.getResultList();
        return projects;
    }

    @Transactional
    public Project findById(Long id) {
        CriteriaBuilder criteriaBuilder = session().getCriteriaBuilder();
        CriteriaQuery<Project> criteriaQuery = criteriaBuilder.createQuery(Project.class);
        Root<Project> root = criteriaQuery.from(Project.class);

        criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("projectId"), id));

        Query<Project> query = session().createQuery(criteriaQuery);
        Project project = query.getSingleResult();
        return project;
    }

    //this use predicates to chain several restrictions
    @Transactional
    public Project findByNameAndMentor(String name, Mentor mentor) {
        CriteriaBuilder criteriaBuilder = session().getCriteriaBuilder();
        CriteriaQuery<Project> criteriaQuery = criteriaBuilder.createQuery(Project.class);
        Root<Project> root = criteriaQuery.from(Project.class);

        Predicate[] predicates = new Predicate[2];
        predicates[1] = criteriaBuilder.equal(root.get("mentorOnProject"), mentor);
        predicates[0] = criteriaBuilder.like(root.get("projectName"), name);
        criteriaQuery.select(root).where(predicates);

        Query<Project> query = session().createQuery(criteriaQuery);
        Project project = query.getSingleResult();
        return project;
    }

    @Transactional
    public int changeProjectMentor(Project project, Mentor mentor) {
        CriteriaBuilder criteriaBuilder = session().getCriteriaBuilder();
        CriteriaUpdate<Project> criteriaUpdate = criteriaBuilder.createCriteriaUpdate(Project.class);
        Root<Project> root = criteriaUpdate.from(Project.class);

        criteriaUpdate.set("mentorOnProject", mentor);
        criteriaUpdate.where(criteriaBuilder.equal(root.get("projectId"), project.getProjectId()));

        int result = session().createQuery(criteriaUpdate).executeUpdate();
        return result;
    }

    @Transactional
    public int deleteById(Long projectId) {
        Project project = this.findById(projectId);

        //Criteria delete does not cascade
        CriteriaBuilder criteriaBuilderAlumnus = session().getCriteriaBuilder();
        CriteriaDelete<Alumnus> criteriaDeleteAlumnus = criteriaBuilderAlumnus.createCriteriaDelete(Alumnus.class);
        Root<Alumnus> rootAlumnus = criteriaDeleteAlumnus.from(Alumnus.class);
        criteriaDeleteAlumnus.where(criteriaBuilderAlumnus.equal(rootAlumnus.get(Alumnus.Fields.project), project));
        session().createQuery(criteriaDeleteAlumnus).executeUpdate();

        CriteriaBuilder criteriaBuilderStudents = session().getCriteriaBuilder();
        CriteriaDelete<Student> criteriaDeleteStudent = criteriaBuilderStudents.createCriteriaDelete(Student.class);
        Root<Student> rootStudent = criteriaDeleteStudent.from(Student.class);
        criteriaDeleteStudent.where(criteriaBuilderStudents.equal(rootStudent.get(Student.Fields.project), project));
        session().createQuery(criteriaDeleteStudent).executeUpdate();

        CriteriaBuilder criteriaBuilder = session().getCriteriaBuilder();
        CriteriaDelete<Project> criteriaDelete = criteriaBuilder.createCriteriaDelete(Project.class);
        Root<Project> root = criteriaDelete.from(Project.class);
        criteriaDelete.where(criteriaBuilder.equal(root, project)); //root can be compared completely
        int result = session().createQuery(criteriaDelete).executeUpdate();
        return result;
    }

    @Transactional
    public void delete(Project project) {
        project = this.findById(project.getProjectId());
        em.remove(project);
    }

    private Session session() {
        return em.unwrap(Session.class);
    }
}

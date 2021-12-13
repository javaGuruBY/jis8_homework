package com.tutrit.hibernateinspring.dao.criteria;

import com.tutrit.hibernateinspring.bean.Mentor;
import com.tutrit.hibernateinspring.bean.Project;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.NoResultException;
import javax.transaction.Transactional;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProjectDaoCriteriaTest {

    @Autowired
    ProjectDaoCriteria projectDaoCriteria;

    @Test
    void findAll() {
        List<Project> projects = projectDaoCriteria.findAll();
        assertEquals(3, projects.size());
        assertEquals(1L, projects.get(2).getProjectId());
    }

    @Test
    void findById() {
        Project project = projectDaoCriteria.findById(1L);
        assertEquals("Fitness service", project.getProjectName());
    }

    @Test
    void findByNameAndMentorId() {
        Mentor mentor = new Mentor();
        mentor.setMentorId(2L);
        Project project = projectDaoCriteria.findByNameAndMentor("Interviewer", mentor);
        assertEquals(2, project.getProjectId());
    }

    @Test
    @Transactional
    void changeProjectMentor() {
        Project project = new Project();
        project.setProjectId(1L);
        Mentor mentor = new Mentor();
        mentor.setMentorId(3L);

        projectDaoCriteria.changeProjectMentor(project, mentor);

        Project newProject = projectDaoCriteria.findById(project.getProjectId());
        assertEquals(3L, newProject.getMentorOnProject().getMentorId());
    }

    @Test
    @Transactional
    void deleteById() {
        Project project = new Project();
        project.setProjectId(1L);

        projectDaoCriteria.deleteById(1L);

        NoResultException ex = assertThrows(
                NoResultException.class,
                () -> projectDaoCriteria.findById(project.getProjectId()), //try to remove size() - test will fail
                "Expected project has been deleted, but it didn't");
        assertTrue(ex.getMessage().contains("No entity found for query"));
    }

    @Test
    @Transactional
    void delete() {
        Project project = new Project();
        project.setProjectId(1L);

        projectDaoCriteria.delete(project);

        NoResultException ex = assertThrows(
                NoResultException.class,
                () -> projectDaoCriteria.findById(project.getProjectId()), //try to remove size() - test will fail
                "Expected project has been deleted, but it didn't");
        assertTrue(ex.getMessage().contains("No entity found for query"));
    }
}
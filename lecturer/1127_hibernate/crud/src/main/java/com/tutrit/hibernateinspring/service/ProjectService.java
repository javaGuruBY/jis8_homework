package com.tutrit.hibernateinspring.service;

import com.tutrit.hibernateinspring.bean.Alumnus;
import com.tutrit.hibernateinspring.bean.Mentor;
import com.tutrit.hibernateinspring.bean.Project;
import com.tutrit.hibernateinspring.bean.Student;
import com.tutrit.hibernateinspring.dao.em.ProjectDao;
import com.tutrit.hibernateinspring.dao.session.ProjectDaoSession;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProjectService {

    ProjectDao projectDao;
    ProjectDaoSession projectDaoSession;

    public List<Project> findAll() {
        List<Project> projects = projectDao.findAll();
        return projects;
    }

    public Project findByMentor(Mentor mentor) {
        Project project = projectDao.findByMentor(mentor);
        return project;
    }

    public List<Student> findStudentsWithProjectBy(Mentor mentor) {
        Project project = projectDao.findByMentor(mentor);
        return project.getStudentsOnProject();
    }

    public List<Alumnus> findAlumnusWithProjectBy(Mentor mentor) {
        Project project = projectDao.findByMentor(mentor);
        return project.getAlumnusOnProject();
    }

    @Transactional
    public List<Student> inOneTransactionFindStudentsWithProjectWhenStudentsLazyBy(Mentor mentor) {
        Project project = projectDao.findByMentor(mentor);
        project.getStudentsOnProject().size(); //try to comment this - test will fail
        return project.getStudentsOnProject();
    }

    // this method use dao with query that explicitly say fetch students in scope of session
    public List<Student> findStudentsWithProjectWhenStudentsLazyBy(Long mentorId) {
        Mentor mentor = new Mentor();
        mentor.setMentorId(mentorId);
        Project project = projectDaoSession.findByMentor(mentor);
        return project.getStudentsOnProject();
    }
}

package com.tutrit.java.quickstart.simplefactory.service;

import com.tutrit.java.quickstart.simplefactory.bean.Student;
import com.tutrit.java.quickstart.simplefactory.provider.Provider;
import java.util.List;

public class StudentService {
    private Provider studentProvider;

    public StudentService(Provider studentProvider) {
        this.studentProvider = studentProvider;
    }

    public void printStudent() {
        List<Student> students =
                studentProvider.getRandomStudentsLinked(10);
        students.forEach(System.out::println);
    }
}

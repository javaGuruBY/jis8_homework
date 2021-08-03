package com.tutrit.java.quickstart.simplefactory.provider;

import com.tutrit.java.quickstart.simplefactory.bean.Student;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentProviderGe extends Provider {

    public Student getStudent() {
        return new Student();
    }

    public Student getStudent(String name, int age) {
        return new Student(name, age);
    }

    public List<Student> getRandomStudentsLinked(int amount) {
        List<Student> studentList = new LinkedList<>();
        for (int i = 0; i <= amount; i++) {
            studentList.add(new Student("ნამე ის " + i, i * 10));
        }
        return studentList;
    }

    public List<Student> getRandomStudentsArrayList(int amount) {
        List<Student> studentList = new ArrayList<>(amount);
        for (int i = 0; i <= amount; i++) {
            studentList.add(new Student("ნამე ის " + i, i * 10));
        }
        return studentList;
    }
}


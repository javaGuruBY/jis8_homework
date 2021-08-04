package com.tutrit.java.quickstart.simplefactory.provider;

import com.tutrit.java.quickstart.simplefactory.bean.Student;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jdk.jshell.spi.ExecutionControl;

public class StudentProviderBy extends Provider {

    public Student getStudent() throws Exception {
        throw new ExecutionControl.NotImplementedException("not implemented");
    }

    public Student getStudent(String name, int age) throws Exception {
        throw new ExecutionControl.NotImplementedException("not implemented");
    }

    public List<Student> getRandomStudentsLinked(int amount) {
        List<Student> studentList = new LinkedList<>();
        for (int i = 0; i <= amount; i++) {
            studentList.add(new Student("iмя " + i, i * 10));
        }
        return studentList;
    }

    public List<Student> getRandomStudentsArrayList(int amount) {
        List<Student> studentList = new ArrayList<>(amount);
        for (int i = 0; i <= amount; i++) {
            studentList.add(new Student("iмя " + i, i * 10));
        }
        return studentList;
    }
}


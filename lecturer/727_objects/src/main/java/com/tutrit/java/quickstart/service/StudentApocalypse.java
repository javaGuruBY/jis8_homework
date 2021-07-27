package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.bean.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentApocalypse {
    public static void run() throws InterruptedException {
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < 4_000_000; i++) {
            studentList.add(new Student(i, "name" + i));
            System.out.println(i);
        }
    }
}

package com.tutrit.java.quickstart.simplefactory.service;

import com.tutrit.java.quickstart.simplefactory.provider.Fabric;
import java.util.Locale;
import org.junit.Test;

public class StudentServiceTest {

    @Test
    public void printStudent() {
        Locale.setDefault(new Locale("ru_RU"));
        StudentService studentService = new StudentService(Fabric.getStudentProvider(Locale.getDefault().toString()));
        studentService.printStudent();
        Locale.getDefault();
    }
}

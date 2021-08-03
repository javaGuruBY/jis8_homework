package com.tutrit.java.quickstart.simplefactory.provider;

import com.tutrit.java.quickstart.simplefactory.bean.Student;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jdk.jshell.spi.ExecutionControl;

public abstract class Provider {

    public abstract Student getStudent() throws ExecutionControl.NotImplementedException, Exception;

    public abstract Student getStudent(String name, int age) throws Exception;

    public abstract List<Student> getRandomStudentsLinked(int amount);

    public abstract List<Student> getRandomStudentsArrayList(int amount);
}

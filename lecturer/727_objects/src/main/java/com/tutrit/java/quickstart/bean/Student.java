package com.tutrit.java.quickstart.bean;

public class Student {
    public int age = 45;
    public String name = "max";
    public Student student;
    public Teacher teacher;
    public static String staticField;
    private static int numberOfObjects;

    {
        this.teacher = new Teacher();
        numberOfObjects++;
        age = 30;
        staticField = "from initialization block";
    }

    static {
        staticField = "from static";
    }

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void doStuff() {
        var i = 0;
    }

}

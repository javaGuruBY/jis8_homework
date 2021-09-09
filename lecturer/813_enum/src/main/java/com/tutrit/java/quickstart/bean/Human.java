package com.tutrit.java.quickstart.bean;

import com.tutrit.java.quickstart.constant.Sex;

public class Human {
    String name;
    int age;
    Sex sex;
    // male-female
    // man-women
    // boy-girl
    // m-w
    // 0-1
    // муж-жен


    public Human(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex.getGenderRus() + '\'' +
                '}';
    }
}

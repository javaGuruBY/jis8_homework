package com.tutrit.java.quickstart.bean;

import java.util.Objects;

public class Individual implements Humanity {

    private String individuality = "I'm important";
    private String name;
    private int age;

    public Individual(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Individual person = (Individual) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Individual{" +
                "individuality='" + individuality + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

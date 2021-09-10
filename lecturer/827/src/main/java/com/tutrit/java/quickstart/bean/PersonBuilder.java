package com.tutrit.java.quickstart.bean;

public class PersonBuilder {
    String name;
    int age;

    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }

    public Person build() {
        return new Person(this);
    }
}

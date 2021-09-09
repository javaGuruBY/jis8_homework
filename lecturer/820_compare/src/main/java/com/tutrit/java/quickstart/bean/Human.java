package com.tutrit.java.quickstart.bean;

import java.util.Objects;

public class Human implements Comparable<Human> {

    public String name;
    public int age;
    public int height;

    public Human(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && height == human.height && Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(Human human) {
        if (human.age == this.age) {
            if (this.name.equals(human.name)) {
                return this.height - human.height;
            }
            return this.name.compareTo(human.name);
        }
        return human.age - this.age;
    }
}

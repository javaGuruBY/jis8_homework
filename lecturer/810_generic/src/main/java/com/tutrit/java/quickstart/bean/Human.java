package com.tutrit.java.quickstart.bean;

public class Human implements Comparable<Human>{


    @Override
    public int compareTo(Human o) {
        return 0;
    }

    public void doit() {
        Human result = this.test(new Lecturer());
    }

    public <T> T test(T plp) {
        return plp;
    }

    class Lecturer extends Human{

    }
    class Student extends Lecturer{

    }

}

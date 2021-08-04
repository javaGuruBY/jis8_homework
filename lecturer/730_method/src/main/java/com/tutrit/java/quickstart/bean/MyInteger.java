package com.tutrit.java.quickstart.bean;

import java.util.Objects;

public class MyInteger {
    Integer integer;

    public void increment() {
        integer++;
    }

    public MyInteger(Integer integer) {
        this.integer = integer;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyInteger myInteger = (MyInteger) o;
        return Objects.equals(integer, myInteger.integer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(integer);
    }

    @Override
    public String

    toString() {
        return "MyInteger{" +
                "integer=" + integer +
                '}';
    }
}

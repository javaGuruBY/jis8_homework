package com.tutrit.java.quickstart.bean;

import java.util.Objects;

public class MyIntegerImmutable {
    private final Integer integer;
    private final MyInteger myInteger;

    public MyIntegerImmutable(final MyIntegerImmutable myIntegerImmutable) {
        this.integer = myIntegerImmutable.getInteger();
        this.myInteger = myIntegerImmutable.getMyInteger();
    }

    public MyIntegerImmutable(final Integer integer, final MyInteger myInteger) {
        this.integer = new Integer(integer);
        this.myInteger = new MyInteger(myInteger.getInteger());
    }

    public MyIntegerImmutable increment() {
        Integer integer = this.integer;
        MyInteger myInteger = this.myInteger;
        integer++;
        myInteger.increment();
        final MyIntegerImmutable result = new MyIntegerImmutable(integer, myInteger);
        return result;
    }

    public Integer getInteger() {
        return integer;
    }

    public MyIntegerImmutable setInteger(final Integer integer) {
        final MyIntegerImmutable result = new MyIntegerImmutable(integer, this.myInteger);
        return result;
    }

    public MyInteger getMyInteger() {
        return new MyInteger(myInteger.getInteger());
    }

    public MyIntegerImmutable setMyInteger(final MyInteger myInteger) {
        final MyIntegerImmutable result = new MyIntegerImmutable(this.integer, myInteger);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyIntegerImmutable myInteger = (MyIntegerImmutable) o;
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

package com.tutrit.java.quickstart.bean;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

    @Test
    public void methodChain() {
        Person person1 = new Person()
                .setAge(34)
                .setName("max");

        System.out.println(person1);
    }

}
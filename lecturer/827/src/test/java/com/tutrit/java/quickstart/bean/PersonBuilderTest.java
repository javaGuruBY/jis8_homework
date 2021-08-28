package com.tutrit.java.quickstart.bean;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonBuilderTest {

    @Test
    public void build() {
        Person person = new PersonBuilder()
                .age(43)
                .name("max")
                .build();
    }

    @Test
    public void nestedBuild() {
        Person person = Person.builder()
                .age(43)
                .name("max")
                .build();
    }
}
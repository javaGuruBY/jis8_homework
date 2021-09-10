package com.tutrit.java.quickstart.service;

import org.junit.Test;

public class ShadowTest {

    @Test
    public void shadow() {

        Shadow shadow = new Shadow();
        Shadow.InnerClass innerClass = shadow.new InnerClass();
        Shadow.StaticNestedClass nestedClass = new Shadow.StaticNestedClass();

        System.out.println();
        innerClass.methodInInner("fromMethod");

        System.out.println();
        nestedClass.methodInNested("fromMethod");

    }
}
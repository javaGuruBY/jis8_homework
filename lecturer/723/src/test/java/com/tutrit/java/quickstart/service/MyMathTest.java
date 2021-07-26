package com.tutrit.java.quickstart.service;

import org.junit.Test;

public class MyMathTest {

    @Test
    public void finallyExample() throws Exception {
        MyMath.finallyExample();
    }

    @Test(expected = MyMaxException.class)
    public void run() throws Exception {
        String[] args = new String[0];
        MyMath.run(args);
    }
}
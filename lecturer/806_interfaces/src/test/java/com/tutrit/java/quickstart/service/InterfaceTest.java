package com.tutrit.java.quickstart.service;

import org.junit.Test;

public class InterfaceTest {

    @Test
    public void run() {
        Base.doStuff();
        BaseAbstract.doStuff();

        BaseImplementation baseImplementation = new BaseImplementation();
        baseImplementation.defaultConfusingStuff();
    }
}

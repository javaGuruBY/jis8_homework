package com.tutrit.java.quickstart.service;

import org.junit.Before;
import org.junit.Test;

public class VarargVsArrayTest {

    VarargVsArray varargVsArray;

    @Before
    public void setUp() {
        varargVsArray = new VarargVsArray();
    }

    @Test
    public void array() {
//        varargVsArray.array();
//        varargVsArray.array(1, 2);
        varargVsArray.array(new int[3]);
        varargVsArray.array(null);

    }

    @Test
    public void vararg() {
        varargVsArray.vararg();
        varargVsArray.vararg(1, 2);
        varargVsArray.vararg(new int[3]);
        varargVsArray.vararg(null);
    }
}
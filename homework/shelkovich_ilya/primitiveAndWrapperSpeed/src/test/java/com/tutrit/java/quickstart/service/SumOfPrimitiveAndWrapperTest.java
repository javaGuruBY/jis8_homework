package com.tutrit.java.quickstart.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SumOfPrimitiveAndWrapperTest {

    Sum sum;
    int a;
    int b;
    Integer c;
    Integer d;

    @Before
    public void setUp() {
        this.sum = new Sum();
        this.a = 10;
        this.b = 10;
        this.c = 10;
        this.d = 10;
    }

    @Test
    public void cycleSumOfPrimitives() {
        int expected = 10_000_000;
        int actual = sum.cycleSumOfPrimitives();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void cycleSumOfWrapper() {
        int expected = 10_000_000;
        int actual = sum.cycleSumOfWrapper();
        Assert.assertEquals(expected, actual);
    }
}

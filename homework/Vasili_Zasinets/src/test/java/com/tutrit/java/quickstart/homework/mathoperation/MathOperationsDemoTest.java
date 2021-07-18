package com.tutrit.java.quickstart.homework.mathoperation;

import org.junit.Assert;
import org.junit.Test;

public class MathOperationsDemoTest {
    MathOperationsDemo mathOperationsDemo = new MathOperationsDemo();


    @Test
    public void sum() {
        Assert.assertEquals(23, mathOperationsDemo.sum(20, 3));
    }

    @Test
    public void subtraction() {
        Assert.assertEquals(17, mathOperationsDemo.subtraction(20, 3));
    }

    @Test
    public void division() {
        Assert.assertEquals(4, mathOperationsDemo.division(20, 5), 0.000);
    }

    @Test
    public void multiplication() {
        Assert.assertEquals(100, mathOperationsDemo.multiplication(20, 5));
    }
}
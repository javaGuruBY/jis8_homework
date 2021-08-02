package com.tutrit.java.quickstart.abstractmath;

import org.junit.Assert;
import org.junit.Test;

public class MultiplicationOperationTest {

    MultiplicationOperation multiplicationOperation = new MultiplicationOperation();

    @Test
    public void compute() {
        double expected = 20;
        Assert.assertEquals(expected, multiplicationOperation.compute(4, 5), 0.000);
    }
}
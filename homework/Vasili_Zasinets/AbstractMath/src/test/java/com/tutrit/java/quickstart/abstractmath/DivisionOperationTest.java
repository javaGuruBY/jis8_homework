package com.tutrit.java.quickstart.abstractmath;

import org.junit.Assert;
import org.junit.Test;

public class DivisionOperationTest {

    DivisionOperation divisionOperation = new DivisionOperation();

    @Test
    public void compute() throws DivisionByZeroException {
        double expected = 0.8;
        Assert.assertEquals(expected, divisionOperation.compute(4, 5), 0.000);

    }

    @Test(expected = DivisionByZeroException.class)
    public void computeException() throws DivisionByZeroException {
        double expected = 20;
        Assert.assertEquals(expected, divisionOperation.compute(4, 0), 0.000);
    }
}
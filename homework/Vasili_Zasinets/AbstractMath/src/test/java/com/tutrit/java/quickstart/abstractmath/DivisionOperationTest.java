package com.tutrit.java.quickstart.abstractmath;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisionOperationTest {

    DivisionOperation divisionOperation = new DivisionOperation();

    @Test
    public void compute() throws DivisionByZeroException {
        assertEquals(0.8, divisionOperation.compute(4, 5), 0.000);
    }

    @Test (expected = DivisionByZeroException.class)
    public void computeException() throws DivisionByZeroException {
        divisionOperation.compute(4, 0);
    }
}

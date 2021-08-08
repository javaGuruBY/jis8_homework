package com.tutrit.java.quickstart.abstractmath;

import org.junit.Test;

import static com.tutrit.java.quickstart.abstractmath.facade.Facade.getResultMathOperation;
import static org.junit.Assert.assertEquals;

public class DivisionOperationTest {

    //getResultMathOperation(String nameOperation, double valueA, double valueB)
    @Test
    public void compute() throws DivisionByZeroException {
        assertEquals(0.8, getResultMathOperation("Division", 4, 5), 0.000);
    }

    @Test(expected = DivisionByZeroException.class)
    public void computeException() throws DivisionByZeroException {
        getResultMathOperation("Division", 4, 0);
    }
}

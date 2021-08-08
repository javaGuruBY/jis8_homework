package com.tutrit.java.quickstart.abstractmath;

import org.junit.Test;

import static com.tutrit.java.quickstart.abstractmath.facade.Facade.getResultMathOperation;
import static org.junit.Assert.assertEquals;

public class MultiplicationOperationTest {

    //getResultMathOperation(String nameOperation, double valueA, double valueB)
    @Test
    public void compute() {
        assertEquals(20, getResultMathOperation("Multiplication", 4, 5), 0.000);
    }
}

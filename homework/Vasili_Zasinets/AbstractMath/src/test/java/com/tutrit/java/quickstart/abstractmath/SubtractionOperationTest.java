package com.tutrit.java.quickstart.abstractmath;

import org.junit.Test;

import static com.tutrit.java.quickstart.abstractmath.facade.Facade.getResultMathOperation;
import static org.junit.Assert.assertEquals;

public class SubtractionOperationTest {

    //getResultMathOperation(String nameOperation, double valueA, double valueB)
    @Test
    public void compute() {
        double expected = -1;
        assertEquals(expected, getResultMathOperation("Subtraction", 4, 5), 0.000);
    }
}

package com.tutrit.java.quickstart.abstractmath;

import org.junit.Test;

import static com.tutrit.java.quickstart.abstractmath.facade.Facade.getResultMathOperation;
import static org.junit.Assert.assertEquals;

public class AdditionOperationTest {

    //getResultMathOperation(String nameOperation, double valueA, double valueB)
    @Test
    public void compute() {
        assertEquals(9, getResultMathOperation("Addition", 5, 4), 0.000);
    }
}

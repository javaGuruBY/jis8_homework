package com.tutrit.java.quickstart.abstractmath;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplicationOperationTest {

    MultiplicationOperation multiplicationOperation = new MultiplicationOperation();

    @Test
    public void compute() {
        assertEquals(20, multiplicationOperation.compute(4, 5), 0.000);
    }
}

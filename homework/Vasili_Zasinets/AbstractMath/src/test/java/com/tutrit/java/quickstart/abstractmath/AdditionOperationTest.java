package com.tutrit.java.quickstart.abstractmath;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdditionOperationTest {
    AdditionOperation additionOperation = new AdditionOperation();

    @Test
    public void compute() {
        assertEquals(9, additionOperation.compute(4, 5), 0.000);
    }
}

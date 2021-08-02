package com.tutrit.java.quickstart.abstractmath;

import org.junit.Assert;
import org.junit.Test;

public class AdditionOperationTest {
    AdditionOperation additionOperation = new AdditionOperation();

    @Test
    public void compute() {
        double expected = 9;
        Assert.assertEquals(expected, additionOperation.compute(4, 5), 0.000);
    }
}
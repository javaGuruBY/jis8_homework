package com.tutrit.java.quickstart.abstractmath;

import org.junit.Assert;
import org.junit.Test;

public class SubtractionOperationTest {
    SubtractionOperation subtractionOperation = new SubtractionOperation();

    @Test
    public void compute() {
        double expected = -1;
        Assert.assertEquals(expected, subtractionOperation.compute(4, 5), 0.000);
    }
}

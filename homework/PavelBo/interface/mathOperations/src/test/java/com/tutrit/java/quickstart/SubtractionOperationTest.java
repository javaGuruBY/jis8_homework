package com.tutrit.java.quickstart;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

public class SubtractionOperationTest {

    SubtractionOperation subtractionOperation;

    @Before
    public void setup() {
        subtractionOperation = new SubtractionOperation();
    }

    @Test
    public void execute() {
        double expected = 2;
        double result = subtractionOperation.execute(4, 2);
        assertEquals(expected, result);
    }
}
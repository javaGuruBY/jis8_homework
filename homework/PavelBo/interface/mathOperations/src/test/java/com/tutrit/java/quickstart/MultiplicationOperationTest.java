package com.tutrit.java.quickstart;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

public class MultiplicationOperationTest {

    MultiplicationOperation multiplicationOperation;

    @Before
    public void setup() {
        multiplicationOperation = new MultiplicationOperation();
    }

    @Test
    public void execute() {
        double expected = 8;
        double result = multiplicationOperation.execute(4, 2);
        assertEquals(expected, result);
    }
}
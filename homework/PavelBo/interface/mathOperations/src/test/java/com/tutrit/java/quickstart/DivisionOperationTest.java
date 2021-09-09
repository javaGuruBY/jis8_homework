package com.tutrit.java.quickstart;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

public class DivisionOperationTest {

    DivisionOperation divisionOperation;

    @Before
    public void setup() {
        divisionOperation = new DivisionOperation();
    }

    @Test
    public void execute() {
        double expected = 2;
        double result = divisionOperation.execute(4, 2);
        assertEquals(expected, result);
    }

    @Test
    public void executeDivZero() {
        double expected = Double.POSITIVE_INFINITY;
        double result = divisionOperation.execute(4, 0);
        assertEquals(expected, result);
    }
}
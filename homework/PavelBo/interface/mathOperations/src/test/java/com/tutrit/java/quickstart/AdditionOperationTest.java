package com.tutrit.java.quickstart;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class AdditionOperationTest {

    AdditionOperation additionOperation;

    @Before
    public void setup() {
        additionOperation = new AdditionOperation();
    }

    @Test
    public void execute() {
        double expected = 6;
        double result = additionOperation.execute(4, 2);
        assertEquals(expected, result);
    }
}
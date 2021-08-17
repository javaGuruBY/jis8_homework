package com.tutrit.java.quickstart.bean;

import com.tutrit.java.quickstart.exceptions.CalculatorException;
import com.tutrit.java.quickstart.exceptions.ZeroException;
import org.junit.Assert;
import org.junit.Test;

public class OperationsTest {

    @Test
    public void plus() throws CalculatorException {
        Assert.assertEquals(20, Operations.PLUS.calculate(10, 10), 0);
    }

    @Test
    public void minus() throws CalculatorException {
        Assert.assertEquals(-30, Operations.MINUS.calculate(0, 30), 0);
    }

    @Test
    public void multi() throws CalculatorException {
        Assert.assertEquals(100, Operations.MULTI.calculate(25, 4), 0);
    }

    @Test(expected = ZeroException.class)
    public void divByZero() throws CalculatorException {
        Operations.DIV.calculate(14, 0);
    }
}
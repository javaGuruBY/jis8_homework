package com.tutrit.java.quickstart.bean;

import com.tutrit.java.quickstart.exceptions.ZeroException;
import org.junit.Assert;
import org.junit.Test;

import static com.tutrit.java.quickstart.bean.Operations.*;

public class OperationsTest {

    @Test
    public void plus() {
        Assert.assertEquals(20, ADDITION.calculate(10, 10), 0);
    }

    @Test
    public void minus()  {
        Assert.assertEquals(-30, SUBTRACTION.calculate(0, 30), 0);
    }

    @Test
    public void multi(){
        Assert.assertEquals(100, MULTIPLICATION.calculate(25, 4), 0);
    }

    @Test
    public void div() {
        Assert.assertEquals(3, DIVISION.calculate(45, 15), 0);
    }

    @Test(expected = ZeroException.class)
    public void divByZero() throws ArithmeticException {
        DIVISION.calculate(14, 0);
    }
}

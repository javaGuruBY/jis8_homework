package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.exceptions.NegativeNumberException;
import com.tutrit.java.quickstart.exceptions.ZeroException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PowerCalculatorTest {

    PowerCalculator powerCalculator;

    @Before
    public void setUp(){
        powerCalculator = new PowerCalculator();
    }

    @Test(expected = NegativeNumberException.class)
    public void shouldThrowNegativeNumberException() throws NegativeNumberException, ZeroException {
        powerCalculator.calculate(-2,45);
    }

    @Test
    public void shouldCalculatePoweredNumber() throws NegativeNumberException, ZeroException {
        Assert.assertEquals(32, powerCalculator.calculate(2,5));
    }

    @Test(expected = ZeroException.class)
    public void shouldThrowZeroException() throws NegativeNumberException, ZeroException {
        powerCalculator.calculate(0,5);
    }
}

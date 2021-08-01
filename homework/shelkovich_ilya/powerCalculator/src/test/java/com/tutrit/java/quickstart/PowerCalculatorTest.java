package com.tutrit.java.quickstart;

import static org.junit.Assert.*;

import com.tutrit.java.quickstart.exceptions.NegativeNumberException;
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
    public void shouldThrowException() throws NegativeNumberException {
        powerCalculator.calculate(-2,45);
    }

    @Test
    public void shouldCalculatePoweredNumber() throws NegativeNumberException {
        Assert.assertEquals(32, powerCalculator.calculate(2,5));
    }
}

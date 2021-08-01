package com.tutrit.java.quickstart;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PowerCalculatorTest {

    PowerCalculator powerCalculator;

    @Before
    public void setUp(){
        powerCalculator = new PowerCalculator();
    }

    @Test
    public void shouldCalculatePoweredNumber() {
        Assert.assertEquals(32, powerCalculator.calculate(2,5));
    }
}

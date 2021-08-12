package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.exceptions.NegativeNumberException;
import com.tutrit.java.quickstart.exceptions.ZeroException;
import com.tutrit.java.quickstart.service.PowerCalculator;
import com.tutrit.java.quickstart.service.NotZeroNumberValidator;
import com.tutrit.java.quickstart.service.PositiveNumberValidator;
import com.tutrit.java.quickstart.service.ValidatorService;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PowerCalculatorTest {

    private PowerCalculator powerCalculator;

    @Before
    public void setUp() {
        powerCalculator = new PowerCalculator(
                new ValidatorService(List.of(
                        new PositiveNumberValidator(),
                        new NotZeroNumberValidator())));
    }

    @Test
    public void shouldCalculatePoweredNumber() throws Exception {
        Assert.assertEquals(32, powerCalculator.raiseToPower(2, 5));
    }

    @Test(expected = NegativeNumberException.class)
    public void shouldThrowNegativeNumberException() throws Exception {
        powerCalculator.raiseToPower(-2, 45);
    }

    @Test(expected = ZeroException.class)
    public void shouldThrowZeroException() throws Exception {
        powerCalculator.raiseToPower(0, 5);
    }
}

package com.tutrit.java.quickstart.homework.number;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberServiceTest {
    NumberService numberService;

    @Before
    public void setUp() {
        numberService = new NumberService();
    }

    @Test
    public void summationOfNumbers() {
        assertEquals(25, numberService.summationOfNumbers(3, 7));
    }

    @Test
    public void evenNumberCounter() {
        assertEquals(4, numberService.evenNumberCounter(9, 2));
    }
}

package com.tutrit.java.quickstart.homework.Vasili_Zasinets.hw0713;

import com.tutrit.java.quickstart.homework.Vasili_Zasinets.hw0713.NumberService;
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
    public void rangeSum() {
        assertEquals(25, numberService.rangeSum(3, 7));

    }

    @Test
    public void rangeEvenCount() {
        assertEquals(4, numberService.rangeEvenCount(9, 2));
    }
}

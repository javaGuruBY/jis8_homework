package com.tutrit.java.quickstart.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SumTest {

    Sum sum;

    @Before
    public void setUp() {
        this.sum = new Sum();
    }

    @Test
    public void timeToCount(){
        Assert.assertTrue(sum.millsToCalculatePrimitives() < sum.millsToCalculateWrappers());
    }

}

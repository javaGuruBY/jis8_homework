package com.tutrit.java.quickstart.homework;

import org.junit.Assert;
import org.junit.Test;

public class SignComparatorTest {
    SignComparator signComparator = new SignComparator();

    @Test
    public void compare() {
        Assert.assertEquals("Number is negative", signComparator.compare(-5));
        Assert.assertEquals("Number is positive", signComparator.compare(5));
        Assert.assertEquals("Number is equal to zero", signComparator.compare(0));
    }
}
package com.tutrit.java.quickstart.service;

import org.junit.Assert;
import org.junit.Test;

public class IntegerServiceTest {

    @Test
    public void equalsWithCache(){
        Integer a = 20;
        Integer b = 20;

        boolean result = a == b;
        Assert.assertTrue(result);
        boolean resultByEquals = a.equals(b);
        Assert.assertTrue(resultByEquals);
    }

    @Test
    public void equalsWithNonCacheRightBorder(){
        Integer a = 200;
        Integer b = 200;

        boolean result = a == b;
        Assert.assertFalse(result);
        boolean resultByEquals = a.equals(b);
        Assert.assertTrue(resultByEquals);
    }

    @Test
    public void equalsWithNonCacheLeftBorder(){
        Integer a = -200;
        Integer b = -200;

        boolean result = a == b;
        Assert.assertFalse(result);
        boolean resultByEquals = a.equals(b);
        Assert.assertTrue(resultByEquals);
    }

    @Test
    public void equalsWithCacheInBorder(){
        Integer a = 127;
        Integer b = 127;

        boolean result = a == b;
        Assert.assertTrue(result);
        boolean resultByEquals = a.equals(b);
        Assert.assertTrue(resultByEquals);

        Integer c = -128;
        Integer d = -128;

        boolean result2 = c == d;
        Assert.assertTrue(result2);
        boolean resultByEquals2 = c.equals(d);
        Assert.assertTrue(resultByEquals2);
    }
}

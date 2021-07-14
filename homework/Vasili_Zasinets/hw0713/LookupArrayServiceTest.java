package com.tutrit.java.quickstart.hw0713;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LookupArrayServiceTest {

    LookupArrayService lookupArrayService = new LookupArrayService();
    int[] array;
    int max;
    int min;
    int indexMin;
    int indexMax;
    int i;

    @Before
    public void setUp() {
        this.lookupArrayService = lookupArrayService;
        this.array = new int[]{1, -2, 8, 9, 6, 3};
        this.max = 9;
        this.min = -2;
        this.indexMin = 1;
        this.indexMax = 3;
        this.i = 5;
    }

    @Test
    public void findMax() {
        Assert.assertEquals(max, lookupArrayService.findMax(array));
    }

    @Test
    public void findMin() {
        Assert.assertEquals(min, lookupArrayService.findMin(array));
    }

    @Test
    public void indexOfMax() {
        Assert.assertEquals(indexMax, lookupArrayService.indexOfMax(array));
    }

    @Test
    public void indexOfMin() {
        Assert.assertEquals(indexMin, lookupArrayService.indexOfMin(array));
    }

    @Test
    public void indexOf() {
        Assert.assertEquals(i, lookupArrayService.indexOf(array, 3));
    }
}

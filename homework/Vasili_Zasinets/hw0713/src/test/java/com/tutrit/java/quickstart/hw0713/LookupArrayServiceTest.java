package com.tutrit.java.quickstart.hw0713;

import com.tutrit.java.quickstart.homework.Vasili_Zasinets.hw0713.LookupArrayService;
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

    }

    @Test
    public void findMax() {
        Assert.assertEquals(9, lookupArrayService.findMax(array));
    }

    @Test
    public void findMin() {
        Assert.assertEquals(-2, lookupArrayService.findMin(array));
    }

    @Test
    public void indexOfMax() {
        Assert.assertEquals(3, lookupArrayService.indexOfMax(array));
    }

    @Test
    public void indexOfMin() {
        Assert.assertEquals(1, lookupArrayService.indexOfMin(array));
    }

    @Test
    public void indexOf() {
        Assert.assertEquals(5, lookupArrayService.indexOf(array, 3));
    }
}

package com.tutrit.java.quickstart.homework.lookarrayservice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LookupArrayServiceTest {

   private LookupArrayService lookUpArrayService;

    @Before
    public void setUp() {
        this.lookUpArrayService = new LookupArrayService();
    }

    @Test
    public void findMax() {
        int[] array = {1, -2, 8, 9, 6, 3};
        Assert.assertEquals(9, lookUpArrayService.findMax(array));
    }

    @Test
    public void findMin() {
        int[] array = {1, -2, 8, 9, 6, 3};
        Assert.assertEquals(-2, lookUpArrayService.findMin(array));
    }

    @Test
    public void indexOfMax() {
        int[] array = {1, -2, 8, 9, 6, 3};
        Assert.assertEquals(3, lookUpArrayService.indexOfMax(array));
    }

    @Test
    public void indexOfMin() {
        int[] array = {1, -2, 8, 9, 6, 3};
        Assert.assertEquals(1, lookUpArrayService.indexOfMin(array));
    }

    @Test
    public void indexOf() {
        int[] array = {1, -2, 8, 9, 6, 3};
        Assert.assertEquals(5, lookUpArrayService.indexOf(array, 3));
    }
}

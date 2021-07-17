package com.tutrit.java.quickstart.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LookUpArrayServiceTest {

    private LookUpArrayService lookUpArrayService;

    @Before
    public void setUp() {
        this.lookUpArrayService = new LookUpArrayService();
    }

    @Test
    public void findMax() {
        int[] array = {1, 3, 12, 4};
        Assert.assertEquals(12, lookUpArrayService.findMax(array));
    }

    @Test
    public void findMin() {
        int[] array = {1, 3, 12, 4};
        Assert.assertEquals(1, lookUpArrayService.findMin(array));
    }

    @Test
    public void shouldReturn0IfArrayIsEmpty() {
        int[] emptyArray = {};
        Assert.assertEquals(0, lookUpArrayService.findMax(emptyArray));
        Assert.assertEquals(0, lookUpArrayService.findMin(emptyArray));
    }

    @Test
    public void indexOfMax() {
        int[] array = {1, 3, 12, 4};
        Assert.assertEquals(2, lookUpArrayService.indexOfMax(array));
    }

    @Test
    public void indexOfMin() {
        int[] array = {1, 3, 12, 4};
        Assert.assertEquals(0, lookUpArrayService.indexOfMin(array));
    }

    @Test
    public void indexOf() {
        int[] array = {1, 3, 12, 4};
        Assert.assertEquals(2, lookUpArrayService.indexOf(array, 12));
    }

    @Test
    public void shouldReturnMinusOneIfArrayIsEmpty() {
        int[] emptyArray = {};
        Assert.assertEquals(-1, lookUpArrayService.indexOfMax(emptyArray));
        Assert.assertEquals(-1, lookUpArrayService.indexOfMin(emptyArray));
        Assert.assertEquals(-1, lookUpArrayService.indexOf(emptyArray, 6));
    }
}

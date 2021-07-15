package com.tutrit.java.quickstart.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LookUpArrayServiceTest {

    LookUpArrayService lookUpArrayService;
    int[] array;
    int[] emptyArray;

    @Before
    public void setUp(){
        this.lookUpArrayService = new LookUpArrayService();
        this.array = new int[]{1, 4, 6, 12};
        this.emptyArray = new int[]{};
    }

    @Test
    public void findMax() {
        int expected = 12;
        int actual = lookUpArrayService.findMax(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findMin() {
        int expected = 1;
        int actual = lookUpArrayService.findMin(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0IfArrayIsEmpty(){
        int expected = 0;
        int actual = lookUpArrayService.findMax(emptyArray);
        Assert.assertEquals(expected, actual);

        int expected2 = 0;
        int actual2 = lookUpArrayService.findMin(emptyArray);
        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void indexOfMax() {
        int expected = 3;
        int actual = lookUpArrayService.indexOfMax(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void indexOfMin() {
        int expected = 0;
        int actual = lookUpArrayService.indexOfMin(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void indexOf() {
        int expected = 2;
        int actual = lookUpArrayService.indexOf(array, 6);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMinusOneIfArrayIsEmpty(){
        int expected = -1;
        int actual = lookUpArrayService.indexOfMax(emptyArray);
        Assert.assertEquals(expected, actual);

        int expected2 = -1;
        int actual2 = lookUpArrayService.indexOfMin(emptyArray);
        Assert.assertEquals(expected2, actual2);

        int expected3 = -1;
        int actual3 = lookUpArrayService.indexOf(emptyArray, 6);
        Assert.assertEquals(expected, actual);
    }
}

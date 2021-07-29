package com.tutrit.java.quickstart.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrayServiceTest {

    ArrayService arrayService;
    Logger log = LoggerFactory.getLogger(ArrayServiceTest.class);


    @Before
    public void setUp() {
        this.arrayService = new ArrayService();
    }

    @Test
    public void createArray() {
        Assert.assertArrayEquals(new int[]{}, arrayService.createArray(0));
    }

    @Test
    public void fillRandomly() {
        int[] array = new int[10];
        Assert.assertNotNull(arrayService.fillRandomly(array));
    }

    @Test
    public void printArray() {
        int[] array = {10, 12, 14};
        arrayService.printArray(array);
    }

    @Test
    public void sum() {
        int[] array = {1, 4, 1};
        Assert.assertEquals(6, arrayService.sum(array));
    }

    @Test
    public void avg() {
        int[] array = {49, 16, 4, 25, 3, 12, 2};
        Assert.assertEquals(15.85714285714286, arrayService.avg(array), 0.00000000000001);
    }

    @Test
    public void sort() {
        int[] array = {6, 4, 5};
        int[] expectedArray = {4, 5, 6};
        Assert.assertArrayEquals(expectedArray, arrayService.sort(array));
    }

    @Test
    public void swap() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expectedArray = {5, 4, 3, 2, 1};
        Assert.assertArrayEquals(expectedArray, arrayService.swap(array));
    }
}

package com.tutrit.java.quickstart.homework.arrayservice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayServiceTest {
    public int[] array;
    ArrayService arrayService = new ArrayService();

    @Before
    public void setUp() {
        this.array = arrayService.create(10);
    }

    @Test
    public void create() {
        Assert.assertNotNull(array);
    }

    @Test
    public void sum() {
        int[] array = {5, 1, 0, 0, -1, -5, 2, 3, 4, 5};
        Assert.assertEquals(14, arrayService.sum(array));
    }

    @Test
    public void avg() {
        int[] array = {2, 10, 0, 2, 1, 3, 4, 4, 6, 8};
        Assert.assertEquals(4, arrayService.avg(array), 0.000);
    }

}
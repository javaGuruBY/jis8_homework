package com.tutrit.java.quickstart.homework.arrayservice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayServiceTest {
    ArrayService arrayService;

    @Before
    public void setUp() {
        this.arrayService = new ArrayService();
    }

    @Test
    public void create() {
        int[] array = arrayService.create(10);
        Assert.assertNotNull(array);
    }

    @Test
    public void sum() {
        int[] array = {5, 1, 0, 0, -1, -5, 2, 3, 4, 5};
        Assert.assertEquals(14, arrayService.sum(array));
    }

    @Test
    public void avg() {
        int[] array = {2, 10, 0, 2, 1, 3, 4, 4, 6, 8, 1};
        Assert.assertEquals(3.7, arrayService.avg(array), 0.1);
    }
}

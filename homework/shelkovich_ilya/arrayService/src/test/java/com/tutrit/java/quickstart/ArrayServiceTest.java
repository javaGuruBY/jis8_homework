package com.tutrit.java.quickstart;

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
    public void createArray() {
        Assert.assertArrayEquals(new int[]{}, arrayService.createArray(0));
    }

    // не уверен что этот тест проверяет то, что я хотел. Я хотел проверить заполняется ли массив случайными числами
    @Test
    public void fillRandomly() {
        int[] array = new int[10];
        Assert.assertArrayEquals(array, arrayService.fillRandomly(array));
    }

    @Test
    public void printArray() {
        int[] array = {10, 12, 14};
        arrayService.printArray(array);
        Assert.assertTrue(true);
    }

    @Test
    public void sum() {
        int[] array = {1, 4, 1};
        Assert.assertEquals(6, arrayService.sum(array));
    }

    @Test
    public void avg() {
        int[] array = {6, 4, 5};
        Assert.assertEquals(5, arrayService.avg(array), 0.0);
    }

    //не понял какой нужен assertion
    @Test
    public void sort() {
        int[] array = {6, 4, 5};
        arrayService.sort(array);
        Assert.assertTrue(true);
    }

    //не понял какой нужен assertion
    @Test
    public void swap() {
        int[] array = {1, 2, 3, 4, 5};
        arrayService.swap(array);
        Assert.assertTrue(true);
    }
}

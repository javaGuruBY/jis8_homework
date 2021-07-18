package com.tutrit.java.quickstart.homework.Vasili_Zasinets.hw0718;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrayServiceTest {
    public int[] array;
    Logger log = LoggerFactory.getLogger("ArrayServiceTest");
    ArrayService arrayService = new ArrayService();

    @Before
    public void setUp() {
        this.array = arrayService.create(10);
    }

    @Test
    public void create() {
        for (int i = 0; i < array.length; i++) {
            log.info("array {} ", i + " = " + array[i]);
        }

    }

    @Test
    public void fillRandomly() {
        arrayService.fillRandomly(array);
        for (int i = 0; i < array.length; i++) {
            log.info("array {} ", i + " = " + array[i]);
        }
    }

    @Test
    public void printArray() {
        arrayService.fillRandomly(array);
        arrayService.printArray(array);
    }

    @Test
    public void sum() {
        int[] array = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        Assert.assertEquals(50, arrayService.sum(array));
    }

    @Test
    public void avg() {
        int[] array = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        Assert.assertEquals(5, arrayService.avg(array), 0.000);
    }
}

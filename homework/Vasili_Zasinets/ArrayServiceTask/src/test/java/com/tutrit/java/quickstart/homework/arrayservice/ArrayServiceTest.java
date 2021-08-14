package com.tutrit.java.quickstart.homework.arrayservice;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ArrayServiceTest {
    ArrayService arrayService;
    int[] arrayTest;

    @Before
    public void setUp() {
        this.arrayService = new ArrayService();
    }

    @Test
    public void create() {
        int[] array = arrayService.create(10);
        assertNotNull(array);
    }

    @Test
    public void sum() throws ArrayVerificationException {
        int[] array = {5, 1, 0, 0, -1, -5, 2, 3, 4, 5};
        assertEquals(14, arrayService.sum(array));
    }

    @Test
    public void avg() throws ArrayVerificationException {
        int[] array = {2, 10, 0, 2, 1, 3, 4, 4, 6, 8, 1};
        assertEquals(3.7, arrayService.avg(array), 0.1);
    }

    @Test(expected = ArrayVerificationException.class)
    public void sumException() throws ArrayVerificationException {
        assertEquals(14, arrayService.sum(arrayTest));
    }

    @Test(expected = ArrayVerificationException.class)
    public void avgException() throws ArrayVerificationException {
        assertEquals(3.7, arrayService.avg(arrayTest), 0.1);
    }

    @Test(expected = ArrayVerificationException.class)
    public void fillRandomlyException() throws ArrayVerificationException {
        arrayService.fillRandomly(arrayTest);
    }

    @Test
    public void fillRandomly() throws ArrayVerificationException {
        int[] array = arrayService.create(15);
        arrayService.fillRandomly(array);
        arrayService.printArray(array);
        assertNotNull(array);
    }

    @Test(expected = ArrayVerificationException.class)
    public void printArrayException() throws ArrayVerificationException{
        arrayService.printArray(arrayTest);
    }
}


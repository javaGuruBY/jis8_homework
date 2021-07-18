package com.tutrit.java.quickstart;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayServiceTest {

    ArrayService arrayService;

    @Before
    public void setUp(){
        this.arrayService = new ArrayService();
    }

    @Test
    public void createArray() {
        Assert.assertArrayEquals(new int[]{}, arrayService.createArray(0));
    }

    // не уверен что этот тест проверяет то, что я хотел. Я хотел проверить заполняется ли массив случайными числами
    @Test
    public void fillRandomly(){
        int[] array = new int[10];
        Assert.assertArrayEquals(array, arrayService.fillRandomly(array));
    }

    @Test
    public void printArray(){
        int[] array = {10, 12, 14};
        arrayService.printArray(array);
        // не понял какой assert можно использовать здесь
    }


}

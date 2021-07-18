package com.tutrit.java.quickstart;

import java.util.concurrent.ThreadLocalRandom;

public class ArrayService {

    public int[] createArray(int size){
        return new int[size];
    }

    public int[] fillRandomly(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = ThreadLocalRandom.current().nextInt(-1, 101);
        } return array;
    }
}

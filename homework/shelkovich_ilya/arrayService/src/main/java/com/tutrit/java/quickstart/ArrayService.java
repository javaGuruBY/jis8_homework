package com.tutrit.java.quickstart;

import java.util.concurrent.ThreadLocalRandom;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrayService {

    Logger log = LoggerFactory.getLogger(ArrayService.class);

    public int[] createArray(int size) {
        return new int[size];
    }

    public int[] fillRandomly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(-1, 101);
        }
        return array;
    }

    public void printArray(int[] array) {
        for (int value : array) {
            log.info("{}", value);
        }
    }

    public int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;
        }
        return sum;
    }

    public double avg(int[] array) {
        return (double) sum(array) / array.length;
    }
}

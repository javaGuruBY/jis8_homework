package com.tutrit.java.quickstart.service;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrayService {

    Logger log = LoggerFactory.getLogger(ArrayService.class);

    public int[] createArray(int size) {
        return new int[size];
    }

    public int[] fillRandomly(int[] array) {
        for (var i = 0; i < array.length; i++) {
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
        var sum = 0;
        for (int j : array) {
            sum = j + sum;
        }
        return sum;
    }

    public double avg(int[] array) {
        return (double) sum(array) /  array.length;
    }

    public int[] sort(int[] array) {
        Arrays.sort(array);
        log.info("{}", array);
        return array;
    }

    public int[] swap(int[] array) {
        for (var i = 0; i < array.length / 2; i++) {
            int element = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = element;
        }
        return array;
    }
}


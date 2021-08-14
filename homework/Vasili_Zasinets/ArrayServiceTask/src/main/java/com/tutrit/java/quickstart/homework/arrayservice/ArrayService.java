package com.tutrit.java.quickstart.homework.arrayservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class ArrayService {
    Logger log = LoggerFactory.getLogger("ArrayService");
    Random random = new Random();

    public int[] create(int size) {
        return new int[size];
    }

    public void fillRandomly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
    }

    public void printArray(int[] array) {
        for (int j : array) {
            log.info("array i = {} ", j);
        }
    }

    public int sum(int[] array) {
        int sumOfArray = 0;
        for (int j : array) {
            sumOfArray += j;
        }
        return sumOfArray;
    }

    public double avg(int[] array) {
        if (verification(array) != 0) {
            int sumOfArray = 0;
            int average;
            for (int j : array) {
                sumOfArray += j;
            }
            average = sumOfArray / (array.length);
            return average;
        }
        return 0;
    }

    public int verification(int[] array) {
        int result = 0;
        if (array != null) {
            result = 1;
        }
        return result;
    }
}

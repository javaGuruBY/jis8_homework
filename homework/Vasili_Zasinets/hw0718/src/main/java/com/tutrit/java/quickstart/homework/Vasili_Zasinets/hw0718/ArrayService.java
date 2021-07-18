package com.tutrit.java.quickstart.homework.Vasili_Zasinets.hw0718;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrayService {

    Logger log = LoggerFactory.getLogger("ArrayService ");

    public int[] create(int size) {
        int[] array = new int[size];
        return array;
    }

    public void fillRandomly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100.1);
        }
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            log.info("array {} ", i + " = " + array[i]);
        }
    }

    public int sum(int[] array) {
        int summOfArray = 0;
        for (int i = 0; i < array.length; i++) {
            summOfArray += array[i];
        }
        return summOfArray;
    }

    public double avg(int[] array) {
        if (array == null) {
            return 0;
        }
        int summOfArray = 0;
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            summOfArray += array[i];
        }
        average = summOfArray / (array.length);

        return average;
    }
}


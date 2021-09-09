package com.tutrit.java.quickstart.homework.lookarrayservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LookupArrayService {
    static Logger log = LoggerFactory.getLogger("Array");

    public int findMax(int[] array) {
        try {
            checkIfArrayEmpty(array);
        } catch (ArrayEmptyException exception) {
            return 0;
        }
        int arrayMax = array[0];
        for (int j : array) {
            if (arrayMax < j) {
                arrayMax = j;
            }
        }
        log.info("arrayMax  = {}", arrayMax);
        return arrayMax;
    }

    public int findMin(int[] array) {
        try {
            checkIfArrayEmpty(array);
        } catch (ArrayEmptyException exception) {
            return 0;
        }
        int arrayMin = array[0];
        for (int j : array) {
            if (arrayMin > j) {
                arrayMin = j;
            }
        }
        log.info("arrayMin = {}", arrayMin);
        return arrayMin;
    }

    public int indexOfMax(int[] array) {
        int indexMax = -1;
        try {
            checkIfArrayEmpty(array);
        } catch (ArrayEmptyException exception) {
            return -1;
        }
        int arrayMax = array[0];
        for (int i = 0; i < array.length; i++) {
            if (arrayMax < array[i]) {
                arrayMax = array[i];
                indexMax = i;
            }
        }
        log.info("indexMax = {}", indexMax);
        return indexMax;
    }


    public int indexOfMin(int[] array) {
        int indexMin = -1;
        try {
            checkIfArrayEmpty(array);
        } catch (ArrayEmptyException exception) {
            return -1;
        }
        int arrayMin = array[0];
        for (int i = 0; i < array.length; i++) {
            if (arrayMin > array[i]) {
                arrayMin = array[i];
                indexMin = i;
            }
        }
        log.info("indexMin = {}", indexMin);
        return indexMin;

    }

    public int indexOf(int[] array, int value) {
        try {
            checkIfArrayEmpty(array);
        } catch (ArrayEmptyException exception) {
            return -1;
        }
        int i = 0;
        while (value != array[i]) {
            i++;
        }
        log.info("indexOf = {}", i);
        return i;
    }

    public void checkIfArrayEmpty(int[] array) throws ArrayEmptyException {
        if (array == null || array.length == 0) {
            throw new ArrayEmptyException("Array could not be empty or zero");
        }
    }
}

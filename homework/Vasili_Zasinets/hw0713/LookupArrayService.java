package com.tutrit.java.quickstart.hw0713;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LookupArrayService {
    static Logger log = LoggerFactory.getLogger("Array");
    int arrayMin = 0;
    int arrayMax = 0;
    int indexMin = -1;
    int indexMax = -1;

    public int findMax(int[] array) {
        if (array == null) return 0;
        arrayMax = array[0];
        for (int i = 0; i < array.length; i++) {
            if (arrayMax < array[i]) {
                arrayMax = array[i];
            }
        }
        log.info("arrayMax  = {}" + arrayMax);
        return arrayMax;
    }

    public int findMin(int[] array) {
        if (array == null) return 0;
        arrayMin = array[0];
        for (int i = 0; i < array.length; i++) {
            if (arrayMin > array[i]) {
                arrayMin = array[i];
            }
        }
        log.info("arrayMin = {}" + arrayMin);
        return arrayMin;

    }

    public int indexOfMax(int[] array) {
        if (array == null) return -1;
        arrayMax = array[0];
        for (int i = 0; i < array.length; i++) {
            if (arrayMax < array[i]) {
                arrayMax = array[i];
                indexMax = i;
            }
        }
        log.info("indexMax = {}" + indexMax);
        return indexMax;
    }


    public int indexOfMin(int[] array) {
        if (array == null) return -1;
        arrayMin = array[0];
        for (int i = 0; i < array.length; i++) {
            if (arrayMin > array[i]) {
                arrayMin = array[i];
                indexMin = i;
            }
        }
        log.info("indexMin = {}" + indexMin);
        return indexMin;

    }

    public int indexOf(int[] array, int value) {
        int i = 0;
        while (value != array[i]) {
            i++;
        }
        log.info("indexOf = {}" + i);
        return i;
    }
}

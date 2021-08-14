package com.tutrit.java.quickstart.service;

public class LookUpArrayServiceEnterpriseEdition {


    public int findMax(int[] array) {
        try {
            checkIfArrayEmpty(array);
        } catch (ArrayEmptyException exception) {
            return 0;
        }
        int max = array[0];
        for (var i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int findMin(int[] array) {
        try {
            checkIfArrayEmpty(array);
        } catch (ArrayEmptyException exception) {
            return 0;
        }
        int min = array[0];
        for (var i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int indexOfMax(int[] array) {
        try {
            checkIfArrayEmpty(array);
        } catch (ArrayEmptyException exception) {
            return -1;
        }
        int arrayMax = array[0];
        var indexOfMax = 0;
        for (var i = 0; i < array.length; i++) {
            if (arrayMax < array[i]) {
                arrayMax = array[i];
                indexOfMax = i;
            }
        }
        return indexOfMax;
    }

    public int indexOfMin(int[] array) {
        try {
            checkIfArrayEmpty(array);
        } catch (ArrayEmptyException exception) {
            return -1;
        }
        int arrayMin = array[0];
        var indexOfMin = 0;
        for (var i = 0; i < array.length; i++) {
            if (arrayMin > array[i]) {
                arrayMin = array[i];
                indexOfMin = i;
            }
        }
        return indexOfMin;
    }

    public int indexOf(int[] array, int value) {
        try {
            checkIfArrayEmpty(array);
        } catch (ArrayEmptyException exception) {
            return -1;
        }
        var i = 0;
        while (value != array[i]) {
            i++;
        }
        return i;
    }

    public void checkIfArrayEmpty(int[] array) throws ArrayEmptyException {
        if (array == null || array.length == 0) {
            throw new ArrayEmptyException("Array could not be empty or zero");
        }
    }
}

package com.tutrit.java.quickstart.service;

public class LookUpArrayService {


    public int findMax(int[] array) {
        int check = checkIfArrayEmptyWhenSearchExtremum(array);
        if (check <= 0) {
            return check;
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
        int check = checkIfArrayEmptyWhenSearchExtremum(array);
        if (check <= 0) {
            return check;
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
        int check = checkIfArrayEmptyWhenSearchIndex(array);
        if (check <= 0) {
            return check;
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
        int check = checkIfArrayEmptyWhenSearchIndex(array);
        if (check <= 0) {
            return check;
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
        int check = checkIfArrayEmptyWhenSearchIndex(array);
        if (check <= 0) {
            return check;
        }
        var i = 0;
        while (value != array[i]) {
            i++;
        }
        return i;
    }

    public int checkIfArrayEmptyWhenSearchExtremum(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        return 1;
    }

    public int checkIfArrayEmptyWhenSearchIndex(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }
        return 1;
    }
}

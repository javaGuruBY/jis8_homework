package com.tutrit.java.quickstart.homework.arrayservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.SecureRandom;

public class ArrayService {
    Logger log = LoggerFactory.getLogger("ArrayService");
    SecureRandom random = new SecureRandom();

    public int[] create(int size) {
        return new int[size];
    }

    public void fillRandomly(int[] array) throws ArrayVerificationException {
        verification(array);
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
    }

    public void printArray(int[] array) throws ArrayVerificationException {
        verification(array);
        for (int j : array) {
            log.info("array i = {} ", j);
        }
    }

    public int sum(int[] array) throws ArrayVerificationException {
        verification(array);
        int sumOfArray = 0;
        for (int j : array) {
            sumOfArray += j;
        }
        return sumOfArray;
    }

    public double avg(int[] array) throws ArrayVerificationException {
        verification(array);
        return (double) sum(array) / (array.length);
    }

    public void verification(int[] array) throws ArrayVerificationException {
        if (array == null) {
            throw new ArrayVerificationException("Array can't be NULL!!!");
        }
    }
}

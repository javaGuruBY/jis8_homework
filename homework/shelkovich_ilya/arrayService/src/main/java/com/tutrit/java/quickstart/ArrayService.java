package com.tutrit.java.quickstart;

import java.util.concurrent.ThreadLocalRandom;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrayService {

    Logger log = LoggerFactory.getLogger(ArrayService.class);

    public int[] createArray(int size){
        return new int[size];
    }

    public int[] fillRandomly(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = ThreadLocalRandom.current().nextInt(-1, 101);
        } return array;
    }

    void printArray(int[] array) {
        for (int value : array){
            log.info("{}", value);
        }
    }

    int sum(int[] array) {
        return 0;
    }
    //- метод должен вернуть сумму всех элементов массива;
    double avg(int[] array) {
        return 0;
    }
    //- метод должен рассчитать среднее арифметическое всех элементов массива (в случае, если массив пустой, вернуть 0);
}

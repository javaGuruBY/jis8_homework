package com.tutrit.java.quickstart.service;

public class Sum {

    public int sumByPrimitives(int a, int b){
        return a + b;
    }

    public Integer sumByWrapper(Integer a, Integer b){
        return a + b;
    }

    public int cycleSumOfPrimitives(){
        int i = 0;
        while (i < 10_000_000){
            sumByPrimitives(3,5);
            i++;
        } return i;
    }

    public int cycleSumOfWrapper(){
        int i = 0;
        while (i < 10_000_000){
            sumByWrapper(3,5);
            i++;
        } return i;
    }

    public long timeForCountPrimitive(){
        long start = System.nanoTime();
        cycleSumOfPrimitives();
        return System.nanoTime() - start;
    }

    public long timeForCountWrapper(){
        long start = System.nanoTime();
        cycleSumOfWrapper();
        return System.nanoTime() - start;
    }
}

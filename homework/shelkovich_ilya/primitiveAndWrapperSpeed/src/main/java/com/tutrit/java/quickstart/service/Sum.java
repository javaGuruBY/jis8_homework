package com.tutrit.java.quickstart.service;

public class Sum {

    public int sumByPrimitives(int a, int b){
        return a + b;
    }

    public Integer sumByWrapper(Integer a, Integer b){
        return a + b;
    }

    public long millsToCalculatePrimitives(){
        int i = 0;
        while (i < 10_000_000){
            sumByPrimitives(3,5);
            i++;
        } return System.currentTimeMillis();
    }

    public long millsToCalculateWrappers(){
        int i = 0;
        while (i < 10_000_000){
            sumByWrapper(3,5);
            i++;
        } return System.currentTimeMillis();
    }
}

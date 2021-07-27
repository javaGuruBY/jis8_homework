package com.tutrit.java.quickstart.service;

public class Sum {

    public int sumByPrimitives(int a, int b){
        return a + b;
    }

    public Integer sumByWrapper(Integer a, Integer b){
        return a + b;
    }

    public long millsToCalculatePrimitives(){
        long start = System.currentTimeMillis();
        var i = 0;
        while (i < 10_000_000){
            sumByPrimitives(300,500);
            i++;
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    public long millsToCalculateWrappers(){
        long start = System.currentTimeMillis();
        var i = 0;
        while (i < 10_000_000){
            sumByWrapper(300,500);
            i++;
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }
}

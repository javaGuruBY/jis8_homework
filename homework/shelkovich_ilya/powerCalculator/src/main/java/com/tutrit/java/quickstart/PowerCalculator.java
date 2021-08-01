package com.tutrit.java.quickstart;

public class PowerCalculator {

    public int calculate(int number, int power){
        var powering = 1;
        for (var i = 0; i < power; i++){
            powering *= number;
        } return powering;
    }
}

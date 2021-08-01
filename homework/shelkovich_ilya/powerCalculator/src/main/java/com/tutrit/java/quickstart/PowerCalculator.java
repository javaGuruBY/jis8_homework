package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.exceptions.NegativeNumberException;

public class PowerCalculator {

    public int calculate(int number, int power) throws NegativeNumberException{
        if (number < 0 || power < 0) {
            throw new NegativeNumberException("Number is negative!");
        }
        var powering = 1;
        for (var i = 0; i < power; i++){
            powering *= number;
        } return powering;
    }
}

package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.exceptions.NegativeNumberException;
import com.tutrit.java.quickstart.exceptions.ZeroException;

public class PowerCalculator {

    public int calculate(int number, int power) throws NegativeNumberException, ZeroException {
        if (number < 0 || power < 0) {
            throw new NegativeNumberException("Number or power is negative!");
        } else  if(number == 0 || power == 0) {
            throw new ZeroException("Result is zero!");
        }
        var powering = 1;
        for (var i = 0; i < power; i++){
            powering *= number;
        } return powering;
    }
}

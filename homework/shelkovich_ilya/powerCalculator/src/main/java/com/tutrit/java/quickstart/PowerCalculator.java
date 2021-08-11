package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.exceptions.NegativeNumberException;
import com.tutrit.java.quickstart.exceptions.ZeroException;

public class PowerCalculator {

    public int calculate(int number, int power) throws NegativeNumberException, ZeroException {
        validateNumberIsPositive(number);
        validateNumberIsPositive(power);
        validateNumberIsNotZero(number);
        validateNumberIsNotZero(power);
        var powering = 1;
        for (var i = 0; i < power; i++) {
            powering *= number;
        }
        return powering;
    }

    private void validateNumberIsPositive(int number) throws NegativeNumberException{
        if (number < 0) {
            throw new NegativeNumberException("Number is negative!");
        }
    }

    private void validateNumberIsNotZero(int number) throws ZeroException{
        if (number == 0) {
            throw new ZeroException("Result of multiplication on zero is zero");
        }
    }
}

package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.exceptions.NegativeNumberException;
import com.tutrit.java.quickstart.exceptions.PowerCalculatorException;

public class PositiveNumberValidator implements Validatable {
    @Override
    public void validate(int number) throws PowerCalculatorException {
        if (number < 0) {
            throw new NegativeNumberException("Negative values are not allowed!");
        }
    }
}


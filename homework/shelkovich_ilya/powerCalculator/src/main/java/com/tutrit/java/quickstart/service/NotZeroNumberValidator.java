package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.exceptions.PowerCalculatorException;
import com.tutrit.java.quickstart.exceptions.ZeroException;

public class NotZeroNumberValidator implements Validatable {
    @Override
    public void validate(int number) throws PowerCalculatorException {
        if (number == 0) {
            throw new ZeroException("Result of multiplication on zero is zero");
        }
    }
}

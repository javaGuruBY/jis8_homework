package com.tutrit.java.quickstart.bean;

import com.tutrit.java.quickstart.exceptions.ZeroException;

public enum Operations {
    ADDITION,
    SUBTRACTION,
    MULTIPLICATION,
    DIVISION;

    double calculate(double x, double y) throws ArithmeticException {
        switch (this) {
            case ADDITION:
                return x + y;
            case SUBTRACTION:
                return x - y;
            case MULTIPLICATION:
                return x * y;
            case DIVISION:
                if (y == 0) {
                    throw new ZeroException("Division by zero is forbidden");
                }
                return x / y;
            default:
                throw new AssertionError("Unknown operation");
        }
    }
}

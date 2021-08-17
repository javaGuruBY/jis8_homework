package com.tutrit.java.quickstart.bean;

import com.tutrit.java.quickstart.exceptions.CalculatorException;
import com.tutrit.java.quickstart.exceptions.ZeroException;

public enum Operations {
    PLUS,
    MINUS,
    MULTI,
    DIV;

    double calculate(double x, double y) throws CalculatorException {
        switch (this) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case MULTI:
                return x * y;
            case DIV:
                if (x == 0 || y == 0) {
                    throw new ZeroException("Division by zero is forbidden");
                }
                return x / y;
            default:
                throw new AssertionError("Unknown operation");
        }
    }
}

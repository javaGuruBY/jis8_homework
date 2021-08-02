package com.tutrit.java.quickstart.abstractmath;

public interface MathOperation {
    double compute(double a, double b) throws DivisionByZeroException;
}

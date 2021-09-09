package com.tutrit.java.quickstart;

public class MultiplicationOperation implements MathOperation {

    @Override
    public double execute(double a, double b) {
        return a * b;
    }
}

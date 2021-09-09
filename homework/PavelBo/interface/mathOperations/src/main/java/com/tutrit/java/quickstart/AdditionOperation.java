package com.tutrit.java.quickstart;

public class AdditionOperation implements MathOperation {

    @Override
    public double execute(double a, double b) {
        return a + b;
    }
}

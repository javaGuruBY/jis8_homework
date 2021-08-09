package com.tutrit.java.quickstart.abstractmath.factory;

import com.tutrit.java.quickstart.abstractmath.DivisionByZeroException;
import com.tutrit.java.quickstart.abstractmath.MathOperation;

public class Operation implements MathOperation {

    @Override
    public double compute(double a, double b) throws DivisionByZeroException {
        return 0;
    }
}

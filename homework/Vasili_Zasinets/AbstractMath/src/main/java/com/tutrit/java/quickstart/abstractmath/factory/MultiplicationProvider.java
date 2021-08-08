package com.tutrit.java.quickstart.abstractmath.factory;

import com.tutrit.java.quickstart.abstractmath.MathOperation;
import com.tutrit.java.quickstart.abstractmath.MultiplicationOperation;

public class MultiplicationProvider implements Provider{

    @Override
    public MathOperation getMathOperation() {
        return new MultiplicationOperation();
    }
}

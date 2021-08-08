package com.tutrit.java.quickstart.abstractmath.factory;

import com.tutrit.java.quickstart.abstractmath.DivisionOperation;
import com.tutrit.java.quickstart.abstractmath.MathOperation;

public class DivisionProvider implements Provider {

    @Override
    public MathOperation getMathOperation() {
        return new DivisionOperation();
    }
}

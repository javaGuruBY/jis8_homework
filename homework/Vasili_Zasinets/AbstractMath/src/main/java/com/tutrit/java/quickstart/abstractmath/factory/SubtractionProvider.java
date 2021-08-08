package com.tutrit.java.quickstart.abstractmath.factory;

import com.tutrit.java.quickstart.abstractmath.MathOperation;
import com.tutrit.java.quickstart.abstractmath.SubtractionOperation;

public class SubtractionProvider implements Provider{

    @Override
    public MathOperation getMathOperation() {
        return new SubtractionOperation();
    }
}

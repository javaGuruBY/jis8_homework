package com.tutrit.java.quickstart.abstractmath.factory;

import com.tutrit.java.quickstart.abstractmath.AdditionOperation;
import com.tutrit.java.quickstart.abstractmath.MathOperation;

public class AdditionProvider implements Provider {

    @Override
    public MathOperation getMathOperation() {
        return new AdditionOperation();
    }
}

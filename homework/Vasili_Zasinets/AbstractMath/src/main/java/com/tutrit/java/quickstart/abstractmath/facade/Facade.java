package com.tutrit.java.quickstart.abstractmath.facade;

import com.tutrit.java.quickstart.abstractmath.factory.Provider;

import static com.tutrit.java.quickstart.abstractmath.factory.Factory.getMathProvider;

public class Facade {
    private Facade() {
    }

    public static double getResultMathOperation(String nameOperation, double valueA, double valueB) {
        Provider provider = getMathProvider(nameOperation);
        return provider.getMathOperation().compute(valueA, valueB);
    }
}

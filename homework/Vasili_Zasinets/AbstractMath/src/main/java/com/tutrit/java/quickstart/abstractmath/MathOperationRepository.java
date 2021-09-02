package com.tutrit.java.quickstart.abstractmath;

import java.util.List;

public class MathOperationRepository {

    public static final List<MathOperation> mathOperationList = List.of(
            new DivisionOperation(),
            new SubtractionOperation(),
            new MultiplicationOperation(),
            new AdditionOperation()
    );

    private MathOperationRepository() {
    }
}

package com.tutrit.java.quickstart.abstractmath.factory;

public class Factory {

    private Factory() {
    }

    public static Provider getMathProvider(String name) {
        return switch (name) {
            case "Division" -> new DivisionProvider();
            case "Addition" -> new AdditionProvider();
            case "Subtraction" -> new SubtractionProvider();
            case "Multiplication" -> new MultiplicationProvider();
            default -> new MathProvider();
        };
    }
}

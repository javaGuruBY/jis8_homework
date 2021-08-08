package com.tutrit.java.quickstart.shape.fabric;

public class Fabric {

    //created a private constructor on the recommendation of sonar
    private Fabric() {
    }

    public static ShapeProvider getNewShape(String name) {
        return switch (name) {
            case "Circle" -> new CircleProvider();
            case "Square" -> new SquareProvider();
            default -> new ShapeProvider();
        };
    }
}

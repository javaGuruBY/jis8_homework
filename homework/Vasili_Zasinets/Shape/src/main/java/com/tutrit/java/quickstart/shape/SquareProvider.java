package com.tutrit.java.quickstart.shape;

public class SquareProvider extends ShapeProvider {

    @Override
    public Square getShape(String name, double sideLength) {
        return new Square(name, sideLength);
    }
}

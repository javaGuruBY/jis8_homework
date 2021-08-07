package com.tutrit.java.quickstart.shape.fabric;

import com.tutrit.java.quickstart.shape.Square;

public class SquareProvider extends ShapeProvider {

    @Override
    public Square getShape(String name, double sideLength) {
        return new Square(name, sideLength);
    }
}

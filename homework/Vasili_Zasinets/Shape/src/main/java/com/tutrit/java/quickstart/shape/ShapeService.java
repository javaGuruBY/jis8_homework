package com.tutrit.java.quickstart.shape;

public class ShapeService {
    ShapeProvider shapeProvider;

    public ShapeService(ShapeProvider shapeProvider) {
        this.shapeProvider = shapeProvider;
    }

    public AbstractShape createShape(String name, double value) {
        return shapeProvider.getShape(name, value);
    }
}

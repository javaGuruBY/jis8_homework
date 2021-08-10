package com.tutrit.java.quickstart.shape.fabric;

import com.tutrit.java.quickstart.shape.AbstractShape;

public class ShapeService {
   private final ShapeProvider shapeProvider;

    public ShapeService(ShapeProvider shapeProvider) {
        this.shapeProvider = shapeProvider;
    }

    public AbstractShape createShape(String name, double value) {
        return shapeProvider.getShape(name, value);
    }
}

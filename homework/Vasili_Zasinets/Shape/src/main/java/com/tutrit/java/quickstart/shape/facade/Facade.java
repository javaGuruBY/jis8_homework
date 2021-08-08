package com.tutrit.java.quickstart.shape.facade;

import com.tutrit.java.quickstart.shape.AbstractShape;
import com.tutrit.java.quickstart.shape.fabric.ShapeService;

import static com.tutrit.java.quickstart.shape.fabric.Fabric.getNewShape;

public class Facade {

    private Facade() {
    }

    public static AbstractShape facadeForShape(String typeShape, String nameShape, double value) {
        ShapeService shapeService = new ShapeService(getNewShape(typeShape));
        return shapeService.createShape(nameShape, value);
    }
}

package com.tutrit.java.quickstart.shape;

public interface Shape {
    String getName();
    double getArea() throws ShapeLengthException;
}

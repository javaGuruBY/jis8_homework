package com.tutrit.java.quickstart.shape;

public class DefaultShape extends AbstractShape {

    public DefaultShape(String name) {
        super(name);
    }

    @Override
    public double circumference() throws ShapeLengthException {
        return 0;
    }

    @Override
    public double perimeter() throws ShapeLengthException {
        return 0;
    }
}

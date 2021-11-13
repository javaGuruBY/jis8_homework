package com.tutrit.java.quickstart.shape;

public class DefaultShape extends AbstractShape {
    double x;

    public DefaultShape(String name) {
        super(name);
    }


    @Override
    public double lengthOfFigureBorders() throws ShapeException {
        verifyShape();
        return 0;
    }

    @Override
    public void verifyShape() throws ShapeException {
        if (x <= 0) {
            throw new ShapeException("Incorrect in data entered");
        }
    }
}

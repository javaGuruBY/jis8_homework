package com.tutrit.java.quickstart.shape;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Circle extends AbstractShape {

    private final double radius;
    Logger log = LoggerFactory.getLogger("Circle");

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void verifyShape() throws ShapeException {
        if (radius <= 0) {
            throw new ShapeException("Incorrect in data entered");
        }
    }

    @Override
    public double lengthOfFigureBorders() throws ShapeException {
        verifyShape();
        return 2 * Math.PI * radius;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() throws ShapeException {
        verifyShape();
        return Math.PI * radius * radius;
    }
}

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
    public double perimeter() {
        log.info("Impossible for this shape");
        return 0;
    }

    @Override
    public double circumference() throws ShapeLengthException {
        if (radius <= 0) {
            throw new ShapeLengthException("Incorrect in data entered");
        }
        return 2 * Math.PI * radius;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() throws ShapeLengthException {
        if (radius <= 0) {
            throw new ShapeLengthException("Incorrect in data entered");
        }
        return Math.PI * radius * radius;
    }
}

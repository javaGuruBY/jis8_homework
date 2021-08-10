package com.tutrit.java.quickstart.shape;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Square extends AbstractShape {

    private final double sideLength;

    Logger log = LoggerFactory.getLogger("Square");

    public Square(String name, double sideLength) {
        super(name);
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() throws ShapeException {
        if (sideLength <= 0) {
            throw new ShapeException("Incorrect in data entered");
        }
        return sideLength * sideLength;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double circumference() {
        log.info("Impossible for this shape");
        return 0;
    }

    @Override
    public double perimeter() throws ShapeException {
        if (sideLength <= 0) {
            throw new ShapeException("Incorrect in data entered");
        }
        return 4 * sideLength;
    }
}

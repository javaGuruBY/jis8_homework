package com.tutrit.java.quickstart.shape;

public abstract class AbstractShape implements Shape{
    protected String name;

    @Override
    public double getArea() throws ShapeLengthException {
        return 0;
    }

    protected AbstractShape(String name) {
        this.name = name;
    }

    public abstract double circumference() throws ShapeLengthException;

    public abstract double perimeter() throws  ShapeLengthException;

    @Override
    public String getName() {
        return name;
    }
}

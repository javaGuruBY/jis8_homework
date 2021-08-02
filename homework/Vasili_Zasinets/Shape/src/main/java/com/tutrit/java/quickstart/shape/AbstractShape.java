package com.tutrit.java.quickstart.shape;

public abstract class AbstractShape implements Shape {
    protected String name;

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

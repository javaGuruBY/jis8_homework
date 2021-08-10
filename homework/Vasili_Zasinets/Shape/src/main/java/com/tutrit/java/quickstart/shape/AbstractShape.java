package com.tutrit.java.quickstart.shape;

public abstract class AbstractShape implements Shape{
    protected String name;


    @Override
    public double getArea() throws ShapeException {
        throw new ShapeException("Incorrect in data entered");
    }

    protected AbstractShape(String name) {
        this.name = name;
    }

    public abstract double circumference() throws ShapeException;

    public abstract double perimeter() throws ShapeException;

    @Override
    public String getName() {
        return name;
    }
}

package com.tutrit.java.quickstart.shape;

public abstract class AbstractShape implements Shape {
    protected String name;


    protected AbstractShape(String name) {
        this.name = name;
    }

    @Override
    public double getArea() throws ShapeException {
        verifyShape();
        return 0;
    }

    public abstract double circumference() throws ShapeException;

    public abstract double perimeter() throws ShapeException;

    public abstract void verifyShape() throws ShapeException;

    @Override
    public String getName() {
        return name;
    }
}

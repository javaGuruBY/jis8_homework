package com.tutrit.java.quickstart.shape;

public class CircleProvider extends ShapeProvider{

    @Override
    public Circle getShape(String name, double radius)  {
        return new Circle(name, radius);
    }
}

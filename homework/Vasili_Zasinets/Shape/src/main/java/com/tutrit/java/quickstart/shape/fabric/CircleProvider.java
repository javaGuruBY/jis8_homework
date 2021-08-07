package com.tutrit.java.quickstart.shape.fabric;

import com.tutrit.java.quickstart.shape.Circle;

public class CircleProvider extends ShapeProvider{

    @Override
    public Circle getShape(String name, double radius)  {
        return new Circle(name, radius);
    }
}

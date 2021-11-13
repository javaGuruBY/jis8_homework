package com.tutrit.java.quickstart.shape.fabric;

import com.tutrit.java.quickstart.shape.AbstractShape;
import com.tutrit.java.quickstart.shape.DefaultShape;

public class ShapeProvider implements Provider{

    @Override
    public AbstractShape getShape(String name, double v) {
        return new DefaultShape(name);
    }
}

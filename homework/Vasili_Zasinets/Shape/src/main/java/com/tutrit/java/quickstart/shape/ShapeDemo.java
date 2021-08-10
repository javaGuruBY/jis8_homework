package com.tutrit.java.quickstart.shape;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShapeDemo {

    public void shapeDemo(Shape... shapes) throws ShapeException {
        Logger log = LoggerFactory.getLogger("ShapeDemo");
        for (Shape shape : shapes) {
            log.info("Name: {}, Area: {}", shape.getName(), shape.getArea());
        }
    }
}

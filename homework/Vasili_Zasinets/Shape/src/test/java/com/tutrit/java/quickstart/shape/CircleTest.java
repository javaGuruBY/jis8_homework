package com.tutrit.java.quickstart.shape;

import org.junit.Test;

import static com.tutrit.java.quickstart.shape.facade.Facade.getNewShape;
import static org.junit.Assert.assertEquals;

public class CircleTest {

    //getNewShape(String typeShape, String nameShape, double value) {
    @Test
    public void lengthOfFigureBorders() throws ShapeException {
        assertEquals(37.7, getNewShape("Circle", "CircleTest", 6).lengthOfFigureBorders(), 0.1);
    }

    @Test
    public void getName() {
        assertEquals("CircleTest", getNewShape("Circle", "CircleTest", 6).getName());
    }

    @Test
    public void getArea() throws ShapeException {
        assertEquals(78.54, getNewShape("Circle", "CircleTest", 5).getArea(), 0.01);
    }

    @Test(expected = ShapeException.class)
    public void lengthOfFigureBordersException() throws ShapeException {
        getNewShape("Circle", "CircleTest", -6).lengthOfFigureBorders();
    }

    @Test(expected = ShapeException.class)
    public void getAreaException() throws ShapeException {
        getNewShape("Circle", "CircleTest", -7).getArea();
    }
}

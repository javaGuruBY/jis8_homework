package com.tutrit.java.quickstart.shape;

import org.junit.Test;

import static com.tutrit.java.quickstart.shape.facade.Facade.getNewShape;
import static org.junit.Assert.assertEquals;

public class SquareTest {

    //getNewShape(String typeShape, String nameShape, double value) {
    @Test
    public void getArea() throws ShapeException {
        assertEquals(25, getNewShape("Square", "SquareTest", 5).getArea(), 0.000);
    }

    @Test
    public void lengthOfFigureBorders() throws ShapeException {
        assertEquals(24, getNewShape("Square", "SquareTest", 6).lengthOfFigureBorders(),0.000);
    }

    @Test
    public void getName() {
        assertEquals("SquareTest", getNewShape("Square", "SquareTest", 5).getName());
    }

    @Test(expected = ShapeException.class)
    public void lengthOfFigureBordersException() throws ShapeException {
        getNewShape("Square", "SquareTest", -5).lengthOfFigureBorders();
    }

    @Test(expected = ShapeException.class)
    public void getAreaException() throws ShapeException {
        getNewShape("Square", "SquareTest", -5).getArea();
    }
}

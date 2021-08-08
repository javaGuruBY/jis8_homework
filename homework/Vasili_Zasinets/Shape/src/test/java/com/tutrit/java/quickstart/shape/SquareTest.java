package com.tutrit.java.quickstart.shape;

import org.junit.Test;

import static com.tutrit.java.quickstart.shape.facade.Facade.facadeForShape;
import static org.junit.Assert.assertEquals;

public class SquareTest {

    //facadeForShape(String typeShape, String nameShape, double value) {
    @Test
    public void getArea() throws ShapeLengthException {
        assertEquals(25, facadeForShape("Square", "SquareTest", 5).getArea(), 0.000);
    }

    @Test
    public void perimeter() throws ShapeLengthException {
        assertEquals(24, facadeForShape("Square", "SquareTest", 6).perimeter(), 0.000);
    }

    @Test
    public void getName() {
        assertEquals("SquareTest", facadeForShape("Square", "SquareTest", 5).getName());
    }

    @Test
    public void circumference() throws ShapeLengthException {
        assertEquals(0, facadeForShape("Square", "SquareTest", 5).circumference(), 0);
    }

    @Test(expected = ShapeLengthException.class)
    public void perimeterException() throws ShapeLengthException {
        facadeForShape("Square", "SquareTest", -5).perimeter();
    }

    @Test(expected = ShapeLengthException.class)
    public void getAreaException() throws ShapeLengthException {
        facadeForShape("Square", "SquareTest", -5).getArea();
    }
}

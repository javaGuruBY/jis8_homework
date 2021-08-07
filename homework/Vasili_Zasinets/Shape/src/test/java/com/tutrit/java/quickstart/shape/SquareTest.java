package com.tutrit.java.quickstart.shape;

import com.tutrit.java.quickstart.shape.facade.Facade;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {

    @Test
    public void getArea() throws ShapeLengthException {
        assertEquals(25, Facade.facadeForShape("Square", "SquareTest", 5).getArea(), 0.000);
    }

    @Test
    public void perimeter() throws ShapeLengthException {
        assertEquals(20, Facade.facadeForShape("Square", "SquareTest", 5).perimeter(), 0.000);
    }

    @Test
    public void getName() {
        assertEquals("SquareTest", Facade.facadeForShape("Square", "SquareTest", 5).getName());
    }

    @Test
    public void circumference() throws ShapeLengthException {
        assertEquals(0, Facade.facadeForShape("Square", "SquareTest", 5).circumference(), 0);
    }

    @Test(expected = ShapeLengthException.class)
    public void perimeterException() throws ShapeLengthException {
        Facade.facadeForShape("Square", "SquareTest", -5).perimeter();
    }

    @Test(expected = ShapeLengthException.class)
    public void getAreaException() throws ShapeLengthException {
        Facade.facadeForShape("Square", "SquareTest", -5).getArea();
    }
}

package com.tutrit.java.quickstart.shape;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {
    Square squareTest = new Square("Square", 5);
    Square squareTestException = new Square("SquareTest", -6);


    @Test
    public void getArea() throws ShapeLengthException {
       assertEquals(25, squareTest.getArea(), 0.000);
    }

    @Test
    public void Perimeter() throws ShapeLengthException {
        assertEquals(20, squareTest.perimeter(), 0.000);
    }

    @Test
    public void getName() {
        assertEquals("Square", squareTest.getName());
    }

    @Test
    public void Circumference() {
        assertEquals(0, squareTest.circumference(), 0);
    }

    @Test(expected = ShapeLengthException.class)
    public void CircumferenceException() throws ShapeLengthException {
        squareTestException.perimeter();
    }

    @Test(expected = ShapeLengthException.class)
    public void GetAreaException() throws ShapeLengthException {
        squareTestException.getArea();
    }
}

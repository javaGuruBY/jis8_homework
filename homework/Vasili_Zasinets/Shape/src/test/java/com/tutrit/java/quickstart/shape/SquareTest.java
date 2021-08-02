package com.tutrit.java.quickstart.shape;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {
    Square squareTest = new Square("Square", 5);
    Square squareTestException = new Square("SquareTest", -6);


    @Test
    public void GetArea() throws ShapeLengthException {
        double expected = 25;
        assertEquals(expected, squareTest.getArea(), 0.000);
    }

    @Test
    public void Perimeter() throws ShapeLengthException {
        double expected = 20;
        assertEquals(expected, squareTest.perimeter(), 0.000);
    }

    @Test
    public void TestGetName() {
        assertEquals("Square", squareTest.getName());
    }

    @Test
    public void Circumference() {
        double expected = 20;
        assertEquals(expected, squareTest.circumference(), 0);
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
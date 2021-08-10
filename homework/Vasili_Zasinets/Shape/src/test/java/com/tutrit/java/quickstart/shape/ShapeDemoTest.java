package com.tutrit.java.quickstart.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeDemoTest {
    ShapeDemo shapeDemoTest = new ShapeDemo();
    ShapeDemo shapeDemoTestException = new ShapeDemo();

    @Test
    public void ShapeDemo() throws ShapeException {
        shapeDemoTest.shapeDemo(new Circle("Circle", 15.9), new Square("Square", 5.52));
        Assert.assertNotNull(shapeDemoTest);
    }

    @Test(expected = ShapeException.class)
    public void ShapeDemoException() throws ShapeException {
       shapeDemoTestException.shapeDemo(new Circle("Circle", -66), new Square("Square", 5.52));
    }
}

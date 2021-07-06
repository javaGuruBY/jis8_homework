package jis8.java.homework.hw2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LightColorDetectorTest {
    LightColorDetector lightColorDetector;

    @Before
    public void setUp() {
        lightColorDetector = new LightColorDetector();
    }

    @Test
    public void detect() {
        assertEquals(lightColorDetector.detect(720), "Red");
    }
}



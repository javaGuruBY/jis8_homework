package com.tutrit.java.quickstart.homework.color;

import org.junit.Assert;
import org.junit.Test;

public class LightColorDetectorTest {
    LightColorDetector lightColorDetector = new LightColorDetector();

    @Test
    public void detect() {
        Assert.assertEquals("Green", lightColorDetector.detect(495));
    }
}

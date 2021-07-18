package com.tutrit.java.quickstart.hw0709.decoder;

import org.junit.Assert;
import org.junit.Test;

public class EncoderTest {
    com.tutrit.java.quickstart.hw0709.decoder.Encoder encoder = new com.tutrit.java.quickstart.hw0709.decoder.Encoder();

    @Test
    public void decode() {
        Assert.assertEquals(88, encoder.decode('X'));
    }

    @Test
    public void encode() {
        Assert.assertEquals('A', encoder.encode(65));
    }
}

package com.github.pavelbopavel;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class EncoderTest {
    Encoder encoder;

    @Before
    public void setUp(){
        encoder = new Encoder();
    }

    @Test
    public void decoder() {
        assertEquals(88, encoder.decoder('X'));
    }

    @Test
    public void encoder() {
        short code = 65;
        assertEquals('A', encoder.encoder(code));
    }
}

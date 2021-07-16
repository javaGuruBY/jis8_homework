package com.github.pavelbopavel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EncoderTest {
    Encoder encoder;

    @Before
    public void setUp(){
        encoder = new Encoder();
    }


    @Test
    public void decoder() {
        encoder.decoder('X');
    }

    @Test
    public void encoder() {
        short code = 65;
        encoder.encoder(code);
    }
}
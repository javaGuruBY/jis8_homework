package com.github.pavelbopavel;

public class EncoderDemo {
    static Encoder encoder = new Encoder();

    public static void main(String[] args) {
        short code = 65;
        encoder.decoder('X');
        encoder.encoder(code);
    }
}


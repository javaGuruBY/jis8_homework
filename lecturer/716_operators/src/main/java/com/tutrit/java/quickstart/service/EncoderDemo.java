package com.tutrit.java.quickstart.service;

public class EncoderDemo {

    public static void main(String[] args) {
        var encoder = new Encoder();
        encoder.decode('X');
        encoder.encode((short) 65);
    }
}

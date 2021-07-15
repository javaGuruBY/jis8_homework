package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.service.Encoder;

public class Application {

    public static void main(String[] args) {
        var encoder = new Encoder();

        encoder.encode((short) 65);
        encoder.decode('z');
    }
}


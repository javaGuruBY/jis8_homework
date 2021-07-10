package com.tutrit.java.quickstart.hw0709.decoder;

public class Encoder {


    void decode(char symbol) {
        int code = (int) symbol;
        System.out.println("code = " + code);
    }

    void encode(short code) {
        char symbol = (char) code;
        System.out.println("symbol = " + symbol);
    }
}

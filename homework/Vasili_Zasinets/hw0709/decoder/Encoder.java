package com.tutrit.java.quickstart.hw0709.decoder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Encoder {

    static Logger log = LoggerFactory.getLogger("Encoder");

    void decode(char symbol) {
        int code = (int) symbol;
        log.info("code = " + code);
    }

    void encode(short code) {
        char symbol = (char) code;
        log.info("symbol = " + symbol);
    }
}

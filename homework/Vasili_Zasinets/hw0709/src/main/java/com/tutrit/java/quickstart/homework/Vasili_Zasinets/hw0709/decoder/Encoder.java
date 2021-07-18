package com.tutrit.java.quickstart.hw0709.decoder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Encoder {

    static Logger log = LoggerFactory.getLogger("Encoder");

    public  int decode(char symbol) {
        int code = (int) symbol;
        log.info("code = {} " + code);
        return code;
    }

    public char encode(int code) {
        char symbol = (char) code;
        log.info("symbol = {} " + symbol);
        return symbol;
    }
}

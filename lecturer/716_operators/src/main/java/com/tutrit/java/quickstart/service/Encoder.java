package com.tutrit.java.quickstart.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Encoder {

    static Logger log = LoggerFactory.getLogger("Encoder");

    int decode(char symbol) {
        int code = (int) symbol;
        log.info("code = " + code);
        return code;
    }

    char encode(short code) {
        char symbol = (char) code;
        log.info("symbol = " + symbol);
        return symbol;
    }

//    public Human add100yeras(Human human) {
//        return null;
//    }
//
//    public Human reduce100yeras(Human human) {
//        return null;
//    }
}

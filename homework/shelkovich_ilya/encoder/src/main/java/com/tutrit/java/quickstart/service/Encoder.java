package com.tutrit.java.quickstart.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Encoder {

    Logger log = LoggerFactory.getLogger("Encoder");

    public char encode(short code){
        var toChar = (char) code;
        log.info("encode {} to {}", code, toChar);
        return toChar;
    }

    public short decode(char symbol){
        var toShort = (short) symbol;
        log.info("decode {} to {}", symbol, toShort);
        return toShort;
    }
}

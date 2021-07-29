package com.github.pavelbopavel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Encoder {

    Logger log = LoggerFactory.getLogger(Encoder.class);

    public int decoder(char symbol){
        log.info("code = {}",(int) symbol);
        return (int) symbol;
    }

    public char encoder(short code){
        log.info("symbol = {}",(char) code);
        return (char) code;
    }
}

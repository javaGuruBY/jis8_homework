package com.github.pavelbopavel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Encoder {

    Logger log = LoggerFactory.getLogger(Encoder.class);

    public void decoder(char symbol){
        log.info("code = {}",(int) symbol);
    }

    public void encoder(short code){
        log.info("symbol = {}",(char) code);
    }
}

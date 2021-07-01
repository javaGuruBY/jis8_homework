package com.tutrit.java.quickstart.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DogService {

    Logger log = LoggerFactory.getLogger("DogService");

    public String makeVoice(String voice) {
        return voice;
    }

    public String eatFood(String dogEats) {
        return dogEats;
    }

    public String goSleep(String dogSleeps) {
        return dogSleeps;
    }

    public void run(){
        log.info(makeVoice("haau haau"));
        log.info(eatFood("Dog wanna eat your soul"));
        log.info(goSleep("Dog dont wanna sleep, dog need more souls"));
    }
}

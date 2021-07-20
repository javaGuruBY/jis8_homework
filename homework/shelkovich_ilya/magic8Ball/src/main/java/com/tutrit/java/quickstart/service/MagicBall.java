package com.tutrit.java.quickstart.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MagicBall {
    Logger log = LoggerFactory.getLogger(MagicBall.class);
    private final Random random = new Random();


    public Map<Integer, String> predictionsMap() {
        Map<Integer, String> magicBall = new HashMap<>();
        magicBall.put(0, "It is certain");
        magicBall.put(1, "It is decidedly so");
        magicBall.put(2, "Without a doubt");
        magicBall.put(3, "Yes — definitely");
        magicBall.put(4, "You may rely on it");
        magicBall.put(5, "As I see it,yes");
        magicBall.put(6, "Most likely");
        magicBall.put(7, "Outlook good");
        magicBall.put(8, "Signs point to yes");
        magicBall.put(9, "Yes");
        magicBall.put(10, "Reply hazy,try again");
        magicBall.put(11, "Ask again later");
        magicBall.put(12, "Better not tell you now");
        magicBall.put(13, "Cannot predict now");
        magicBall.put(14, "Don’t count on it");
        magicBall.put(15, "My reply is no");
        magicBall.put(16, "My sources say no");
        magicBall.put(17, "Outlook not so good");
        magicBall.put(18, "Very doubtful");
        magicBall.put(19, "Concentrate and ask again");
        return magicBall;
    }

    public int randomNumberOfPrediction() {
        return random.nextInt(20);
    }

    public void printPrediction() {
        log.info("Prediction: {}", predictionsMap().get(randomNumberOfPrediction()));
    }
}

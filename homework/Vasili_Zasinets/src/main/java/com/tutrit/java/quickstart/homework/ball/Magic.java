package com.tutrit.java.quickstart.homework.ball;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Magic {
    Logger log = LoggerFactory.getLogger("Magic Ball ");
    Map<Integer, String> ball = new HashMap<>();
    Random random = new Random();

    void addPrediction() {
        ball.put(0, "It is certain");
        ball.put(1, "It is decidedly so");
        ball.put(2, "Without a doubt");
        ball.put(3, "Yes — definitely");
        ball.put(4, "You may rely on it");
        ball.put(5, "As I see it,yes");
        ball.put(6, "Most likely");
        ball.put(7, "Outlook good");
        ball.put(8, "Signs point to yes");
        ball.put(9, "Yes");
        ball.put(10, "Reply hazy,try again");
        ball.put(11, "Ask again later");
        ball.put(12, "Better not tell you now");
        ball.put(13, "Cannot predict now");
        ball.put(14, "Don’t count on it");
        ball.put(15, "My reply is no");
        ball.put(16, "My sources say no");
        ball.put(17, "Outlook not so good");
        ball.put(18, "Very doubtful");
        ball.put(19, "Concentrate and ask again");
    }

    int number() {
        return random.nextInt(20);
    }

    void prediction() {
        log.info("Prediction fo you: {}", ball.get(number()));
    }

    @Override
    public String toString() {
        return "Magic{" +
                "ball=" + ball +
                '}';
    }

}

package com.tutrit.java.quickstart.homework.ball;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class Magic {

    private final Random random = new Random();
    private final Ball[] ball = Ball.values();
    Logger log = LoggerFactory.getLogger("Magic Ball");

    public int number() {
        return random.nextInt(ball.length);
    }

    public Ball predictNext() {
        return ball[number()];
    }

    public void predict() {
        log.info("Prediction fo you: {}", predictNext());
    }

    public Ball[] getBall() {
        return ball;
    }
}
package com.tutrit.java.quickstart.abstractmath;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubtractionOperation implements MathOperation {

    Logger log = LoggerFactory.getLogger("SubtractionOperation");

    @Override
    public double compute(double a, double b) {
        double result = a - b;
        log.info("Result: {}", result);
        return result;
    }
}

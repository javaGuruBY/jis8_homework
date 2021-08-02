package com.tutrit.java.quickstart.abstractmath;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DivisionOperation implements MathOperation {

    Logger log = LoggerFactory.getLogger("DivisionOperation");

    @Override
    public double compute(double a, double b) throws DivisionByZeroException {

        if (b == 0) {
            throw new DivisionByZeroException("Division by zero is prohibited");
        } else {
            double result = a / b;
            log.info("Result: {}", result);
            return result;
        }
    }
}

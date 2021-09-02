package com.tutrit.java.quickstart.abstractmath;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.tutrit.java.quickstart.abstractmath.MathOperationRepository.mathOperationList;

public class OperationExecutor {

    Logger log = LoggerFactory.getLogger("OperationExecutor");

    public void execute(double a, double b) {
        try {
            mathOperationList.forEach(m -> m.compute(a, b));
        } catch (DivisionByZeroException exception) {
            log.warn(exception.toString());
        }
    }
}


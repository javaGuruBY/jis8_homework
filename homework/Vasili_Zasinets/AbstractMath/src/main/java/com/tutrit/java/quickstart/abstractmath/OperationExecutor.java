package com.tutrit.java.quickstart.abstractmath;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OperationExecutor {

    Logger log = LoggerFactory.getLogger("OperationExecutor");

    public void execute(MathOperation[] operations, double a, double b) {

        for (MathOperation operation : operations) {
            try {
                operation.compute(a, b);
            } catch (DivisionByZeroException exception) {
                log.warn(exception.toString());
            }
        }
    }
}

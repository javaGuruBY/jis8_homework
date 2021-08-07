package com.tutrit.java.quickstart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OperationExecutor {
    Logger logger = LoggerFactory.getLogger(OperationExecutor.class);
    public void execute(MathOperation[] operations, double a, double b){
        for(MathOperation mathOperation : operations) {
            logger.info("result {} = {}", mathOperation.getClass().toString(), mathOperation.execute(a, b));
        }
    }
}

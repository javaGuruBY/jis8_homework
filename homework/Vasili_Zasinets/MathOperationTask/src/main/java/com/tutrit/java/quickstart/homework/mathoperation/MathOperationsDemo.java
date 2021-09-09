package com.tutrit.java.quickstart.homework.mathoperation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathOperationsDemo {

    Logger log = LoggerFactory.getLogger("MathOperations ");

   public int sum(int a, int b) {
        int result = a + b;
        log.info("Sum {}", result);
        return result;
    }

    public int subtraction(int a, int b) {
        int result = a - b;
        log.info("Subtraction {}", result);
        return result;
    }

    public float division(int a, int b) {
        float result = (float) a / b;
        log.info("Division {}", result);
        return result;
    }

    public int multiplication(int a, int b) {
        int result = a * b;
        log.info("Multiplication {}", result);
        return result;
    }
}

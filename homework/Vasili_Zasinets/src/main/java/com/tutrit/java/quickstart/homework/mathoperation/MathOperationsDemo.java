package com.tutrit.java.quickstart.homework.mathoperation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathOperationsDemo {

    Logger log = LoggerFactory.getLogger("MathOperations ");

    int sum(int a, int b) {
        log.info("Sum {}", a + b);
        return a + b;

    }

    int subtraction(int a, int b) {
        log.info("Subtraction {}", a - b);
        return a - b;
    }

    float division(int a, int b) {
        log.info("Division {}", a / b);
        return (float) a / b;

    }

    int multiplication(int a, int b) {
        log.info("Multiplication {}", a * b);
        return a * b;

    }
}

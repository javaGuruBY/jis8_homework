package com.tutrit.java.quickstart.homework.mathoperation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathOperationsDemo {
    public static void main(String[] args) {

        Logger log = LoggerFactory.getLogger("MathOperations ");
        int a = 50;
        int b = 12;
        int subtraction;
        int sum;
        float division;
        int multiplication;

        log.info("Var a {}", a);
        log.info("Var b {}", b);

        sum = a + b;
        log.info("Sum {}", sum);

        subtraction = a - b;
        log.info("Subtraction {}", subtraction);

        division = (float) a / b;
        log.info("Division {}", division);

        multiplication = a * b;
        log.info("Multiplication {}", multiplication);

    }
}


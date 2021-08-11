package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.exceptions.PowerCalculatorException;

public class PowerCalculator {

    ValidatorService validatorService;

    public PowerCalculator(ValidatorService validatorService) {
        this.validatorService = validatorService;
    }

    public int calculate(int number, int power) throws PowerCalculatorException {
        validatorService.validate(number, power);
        var powering = 1;
        for (var i = 0; i < power; i++) {
            powering *= number;
        }
        return powering;
    }
}

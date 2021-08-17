package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.exceptions.PowerCalculatorException;

public class PowerCalculator {

    ValidatorService validatorService;

    public PowerCalculator(ValidatorService validatorService) {
        this.validatorService = validatorService;
    }

    public int raiseToPower(int number, int power) throws PowerCalculatorException {
        validatorService.validate(number, power);
        var result = 1;
        for (var i = 0; i < power; i++) {
            result *= number;
        }
        return result;
    }
}

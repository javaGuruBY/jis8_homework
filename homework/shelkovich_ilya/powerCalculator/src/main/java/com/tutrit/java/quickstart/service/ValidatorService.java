package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.exceptions.PowerCalculatorException;
import java.util.List;

public class ValidatorService {

    List<Validatable> validatableList;

    public ValidatorService(List<Validatable> validatableList) {
        this.validatableList = validatableList;
    }

    public void validate(int... numbers) throws PowerCalculatorException {
        for (Validatable validatable : validatableList) {
            for (int n : numbers) {
                validatable.validate(n);
            }
        }
    }
}

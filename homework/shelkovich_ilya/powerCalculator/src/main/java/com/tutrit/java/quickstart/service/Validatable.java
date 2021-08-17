package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.exceptions.PowerCalculatorException;

public interface Validatable {
    void validate(int number) throws PowerCalculatorException;
}

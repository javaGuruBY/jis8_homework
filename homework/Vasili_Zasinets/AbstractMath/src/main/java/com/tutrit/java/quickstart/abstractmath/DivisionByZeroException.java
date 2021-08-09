package com.tutrit.java.quickstart.abstractmath;

public class DivisionByZeroException extends ArithmeticException{
    public DivisionByZeroException(String message) {
        super(message);
    }
}

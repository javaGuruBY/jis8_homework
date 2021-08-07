package com.tutrit.java.quickstart.abstractmath;

public class DivisionByZeroException extends RuntimeException{
    public DivisionByZeroException(String message) {
        super(message);
    }
}

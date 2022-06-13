package com.tutrit.java.quickstart.junit;

public class UserValidationException extends NullPointerException {
    public UserValidationException(String message) {
        super(message);
    }

    public UserValidationException(Exception e) {
        super(e.toString());
    }
}

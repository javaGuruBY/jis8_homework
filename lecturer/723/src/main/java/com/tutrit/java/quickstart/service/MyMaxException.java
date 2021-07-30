package com.tutrit.java.quickstart.service;

public class MyMaxException extends Exception {
    public MyMaxException(String format, Exception exception) {
        super(format, exception);
    }

    public MyMaxException() {
        super();
    }
}

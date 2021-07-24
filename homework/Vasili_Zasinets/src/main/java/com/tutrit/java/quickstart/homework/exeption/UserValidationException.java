package com.tutrit.java.quickstart.homework.exeption;

public class UserValidationException extends RuntimeException{
    public UserValidationException(String message){
        super(message);
    }
}

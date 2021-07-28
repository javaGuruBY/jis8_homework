package com.tutrit.java.quickstart.homework.exeption;

public class NameUserValidationException extends  UserValidationException{
   public NameUserValidationException(){
        super("FirstName or LastNames entered incorrectly");
    }
}

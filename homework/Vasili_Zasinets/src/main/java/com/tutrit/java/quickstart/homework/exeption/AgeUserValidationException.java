package com.tutrit.java.quickstart.homework.exeption;

public class AgeUserValidationException extends UserValidationException{
   public AgeUserValidationException(){
        super("Incorrect age entered");
    }
}

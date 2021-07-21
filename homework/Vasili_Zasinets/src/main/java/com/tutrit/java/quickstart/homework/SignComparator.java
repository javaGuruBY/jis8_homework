package com.tutrit.java.quickstart.homework;

public class SignComparator {


    public String compare(int number) {

        if (number < 0) {
            return "Number is negative";
        } else if (number > 0) {
            return "Number is positive";
        } else {
            return "Number is equal to zero";
        }
    }
}

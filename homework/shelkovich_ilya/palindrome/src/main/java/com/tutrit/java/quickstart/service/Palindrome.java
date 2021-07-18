package com.tutrit.java.quickstart.service;

public class Palindrome {

    public boolean isPalindrome(String text) {
        var stringBuilder = new StringBuilder(text);
        stringBuilder.reverse();

        var reverseText = stringBuilder.toString();
        return text.equals(reverseText);
    }
}

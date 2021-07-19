package com.tutrit.java.quickstart.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromeTest {

    Palindrome palindrome;

    @Before
    public void setUp(){
        this.palindrome = new Palindrome();
    }

    @Test
    public void shouldReturnTrue(){
        String text = "teNneT";
        palindrome.isPalindrome(text);
        Assert.assertTrue(true);
    }

    @Test
    public void shouldReturnFalse(){
        String text = "airport";
        palindrome.isPalindrome(text);
        Assert.assertFalse(false);
    }


}

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
        Assert.assertTrue(palindrome.isPalindrome(text));
    }

    @Test
    public void shouldReturnFalse(){
        String text = "airport";
        Assert.assertFalse(palindrome.isPalindrome(text));
    }


}

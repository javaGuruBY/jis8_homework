package com.tutrit.java.quickstart.homework;

import org.junit.Assert;
import org.junit.Test;

public class UserLoginServiceTest {
    User userOne = new User("Login", "256");
    UserLoginService userLoginService = new UserLoginService();

    @Test
    public void login() {
        Assert.assertTrue(userLoginService.login(userOne, "256"));
        Assert.assertFalse(userLoginService.login(userOne, "456"));
        Assert.assertEquals(2, userOne.getNumberOfAttempts());
        Assert.assertFalse(userOne.isBlock());
        Assert.assertFalse(userLoginService.login(userOne, "1236"));
        Assert.assertEquals(1, userOne.getNumberOfAttempts());
        Assert.assertFalse(userLoginService.login(userOne, "hgf"));
        Assert.assertEquals(0, userOne.getNumberOfAttempts());
        Assert.assertFalse(userLoginService.login(userOne, "256"));
        Assert.assertEquals(0, userOne.getNumberOfAttempts());
        Assert.assertTrue(userOne.isBlock());

    }
}

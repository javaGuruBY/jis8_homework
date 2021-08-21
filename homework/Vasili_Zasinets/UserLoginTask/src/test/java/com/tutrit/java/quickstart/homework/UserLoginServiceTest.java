package com.tutrit.java.quickstart.homework;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserLoginServiceTest {
    User userOne = new User("Login", "256");
    UserLoginService userLoginService = new UserLoginService();
    Logger log = LoggerFactory.getLogger("UserTest");

    @Test
    public void login() {

        assertTrue(userLoginService.login(userOne, "256"));

        log.info("User status - isBlock {}, Number of attempts {} ", userOne.isBlock, userOne.getNumberOfAttempts());

        for (int i = 0; i < 3; i++) {
            userLoginService.login(userOne, "456");
            log.info("User status - isBlock {}, Number of attempts {} ", userOne.isBlock, userOne.getNumberOfAttempts());
        }

        assertFalse(userLoginService.login(userOne, "256"));
    }
}

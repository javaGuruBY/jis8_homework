package com.tutrit.java.quickstart.junit;

import org.junit.Test;

public class UserServiceExceptionTest {

    UserService userService2 = new UserService();
    User userNullTest;

    @Test(expected = UserValidationException.class)
    public void addUserExceptoinIdTest() throws UserValidationException {
        User userTest = new User(0, "FFFF", 444);
        userService2.addUser(userTest);
    }

    @Test(expected = UserValidationException.class)
    public void addUserExceptoinTest() throws UserValidationException {
        userService2.addUser(userNullTest);
    }
}

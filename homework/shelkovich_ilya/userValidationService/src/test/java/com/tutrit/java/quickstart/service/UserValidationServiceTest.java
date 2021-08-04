package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.bean.User;
import com.tutrit.java.quickstart.exceptions.UserValidationException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserValidationServiceTest {

    UserValidationService userValidationService;
    User user;

    @Before
    public void setUp() {
        this.userValidationService = new UserValidationService();
        this.user = new User();
    }

    @Test
    public void shouldThrowValidateExceptionLastName() throws UserValidationException {
        user.setFirstName("Anna");
        user.setLastName("Matarazzzzzzzzzio");
        user.setAge(21);
        Assert.assertFalse(userValidationService.validate(user));
    }

    @Test
    public void shouldThrowValidateExceptionFirstName() throws UserValidationException {
        user.setFirstName("An");
        user.setLastName("Matarazo");
        user.setAge(21);
        Assert.assertFalse(userValidationService.validate(user));
    }

    @Test
    public void shouldThrowValidateExceptionAge() throws UserValidationException {
        user.setFirstName("Anna");
        user.setLastName("Matarazo");
        user.setAge(2021);
        Assert.assertFalse(userValidationService.validate(user));
    }

    @Test
    public void shouldValidateUser() throws UserValidationException {
        user.setFirstName("Anna");
        user.setLastName("Matarazo");
        user.setAge(21);
        Assert.assertTrue(userValidationService.validate(user));
    }
}

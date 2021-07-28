package com.tutrit.java.quickstart.homework.exeption;

import org.junit.Before;
import org.junit.Test;

public class UserValidationServiceTest {
    private User userTest;
    private UserValidationService userValidationService;

    @Before
    public void setUp() {
        this.userTest = new User("De", "Laskondzortestservicepractic", 155);
        this.userValidationService = new UserValidationService();
    }

    @Test(expected = NameUserValidationException.class)
    public void firstNameUserValidation() throws NameUserValidationException {
        userValidationService.firstNameUserValidation(userTest);
    }

    @Test(expected = NameUserValidationException.class)
    public void lastNameUserValidation() throws NameUserValidationException {
        userValidationService.lastNameUserValidation(userTest);
    }

    @Test(expected = AgeUserValidationException.class)
    public void ageUserValidation() throws AgeUserValidationException {
        userValidationService.ageUserValidation(userTest);
    }
}

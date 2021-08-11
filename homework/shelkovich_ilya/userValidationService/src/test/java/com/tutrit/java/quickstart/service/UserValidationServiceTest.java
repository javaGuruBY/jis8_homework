package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.bean.User;
import com.tutrit.java.quickstart.exceptions.UserValidationException;
import com.tutrit.java.quickstart.validator.CheckUserAge;
import com.tutrit.java.quickstart.validator.CheckUserNameLength;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class UserValidationServiceTest {

    private UserValidationService userValidationService;

    @Before
    public void setUp() {
        this.userValidationService = new UserValidationService(
                List.of(
                        new CheckUserAge(),
                        new CheckUserNameLength()));
    }

    @Test(expected = UserValidationException.class)
    public void ifFirstOrLastNameIsMoreThan15Letters() throws UserValidationException {
        userValidationService.validate(new User("Anna", "Matarazzzzzzzzzio", 21));
    }

    @Test(expected = UserValidationException.class)
    public void ifFirstOrLastNameIsLessThan3Letters() throws UserValidationException {
        userValidationService.validate(new User("An", "Matarazo", 21));
    }

    @Test(expected = UserValidationException.class)
    public void ifUserAgeOutOfRightBound() throws UserValidationException {
        userValidationService.validate(new User("Elder", "Ghost", 2021));
    }

    @Test(expected = UserValidationException.class)
    public void ifUserAgeOutOfLeftBound() throws UserValidationException {
        userValidationService.validate(new User("Unborn", "Child", -23));
    }

    @Test(expected = UserValidationException.class)
    public void ifUserFirstOrLastNameIsEmpty() throws UserValidationException {
        userValidationService.validate(new User());
    }

    @Test
    public void shouldValidateUser() throws UserValidationException {
        userValidationService.validate(new User("Anna", "Matarazo", 21));
    }
}

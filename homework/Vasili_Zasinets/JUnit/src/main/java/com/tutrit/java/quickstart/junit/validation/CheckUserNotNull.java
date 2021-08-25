package com.tutrit.java.quickstart.junit.validation;

import com.tutrit.java.quickstart.junit.User;
import com.tutrit.java.quickstart.junit.UserValidationException;

public class CheckUserNotNull implements Checkable {

    @Override
    public void check(User user) throws UserValidationException {
        if (user == null) {
            throw new UserValidationException("User must be not null");
        }
    }
}

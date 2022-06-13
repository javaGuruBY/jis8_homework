package com.tutrit.java.quickstart.junit.validation;

import com.tutrit.java.quickstart.junit.User;
import com.tutrit.java.quickstart.junit.UserValidationException;

public class CheckUserId implements Checkable {

    @Override
    public void check(User user) throws UserValidationException {
        if (user.getId() == 0) {
            throw new UserValidationException("Id must be not null");
        }
    }
}

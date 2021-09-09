package com.tutrit.java.quickstart.validator;

import com.tutrit.java.quickstart.bean.User;
import com.tutrit.java.quickstart.exceptions.UserValidationException;

public class CheckUserAge implements Checkable {
    public void check(User user) throws UserValidationException {
        if (user.getAge() < 0 || user.getAge() > 120) {
            throw new UserValidationException("Age is incorrect");
        }
    }
}

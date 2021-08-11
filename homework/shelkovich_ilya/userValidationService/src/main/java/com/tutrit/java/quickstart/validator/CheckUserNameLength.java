package com.tutrit.java.quickstart.validator;

import com.tutrit.java.quickstart.bean.User;
import com.tutrit.java.quickstart.exceptions.UserValidationException;

public class CheckUserNameLength implements Checkable {
    public void check(User user) throws UserValidationException {
        if (user.getFirstName() == null || user.getLastName() == null) {
            throw new UserValidationException("First and Last name should not be empty");
        }
        if (user.getFirstName().length() < 3 || user.getLastName().length() < 3) {
            throw new UserValidationException("First and Last name should contain more than 3 letters");
        } else if (user.getFirstName().length() > 15 || user.getLastName().length() > 15) {
            throw new UserValidationException("First and Last name should contain less than 15 letters");
        }
    }
}

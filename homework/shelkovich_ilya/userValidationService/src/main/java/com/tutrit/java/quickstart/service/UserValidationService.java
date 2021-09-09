package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.bean.User;
import com.tutrit.java.quickstart.exceptions.UserValidationException;
import com.tutrit.java.quickstart.validator.Checkable;
import java.util.List;

public class UserValidationService {

    private final List<Checkable> checkableList;

    public UserValidationService(final List<Checkable> checkableList) {
        this.checkableList = checkableList;
    }

    public boolean validate(final User user) throws UserValidationException {
        for (Checkable checkable : checkableList) {
            checkable.check(user);
        }
        return true;
    }
}

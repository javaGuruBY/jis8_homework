package com.tutrit.java.quickstart.validator;

import com.tutrit.java.quickstart.bean.User;
import com.tutrit.java.quickstart.exceptions.UserValidationException;

public interface Checkable {
    void check(User user) throws UserValidationException;
}

package com.tutrit.java.quickstart.junit.validation;

import com.tutrit.java.quickstart.junit.User;
import com.tutrit.java.quickstart.junit.UserValidationException;

public interface Checkable {

    void check(User user) throws UserValidationException;
}

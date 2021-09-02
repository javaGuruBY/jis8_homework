package com.tutrit.java.quickstart.junit.validation;

import com.tutrit.java.quickstart.junit.User;
import com.tutrit.java.quickstart.junit.UserValidationException;

import java.util.List;

public class Validator {

    private static final List<Checkable> userCheck = List.of(
            new CheckUserNotNull(),
            new CheckUserId()
    );

    private Validator() {
    }

    public static void validation(User user) {
        userCheck.forEach(u -> {
            try {
                u.check(user);
            } catch (Exception e) {
                throw new UserValidationException(e);
            }
        });
    }
}

package com.tutrit.java.quickstart.homework.exeption;

public class UserValidationService {

    void userValidation(User user) throws UserValidationException {
        firstNameUserValidation(user);
        lastNameUserValidation(user);
        ageUserValidation(user);
    }

    void firstNameUserValidation(User user) {
        if (user.getFirstName().length() < 3 || user.getFirstName().length() > 15) {
            throw new NameUserValidationException();
        }
    }

    void lastNameUserValidation(User user) {
        if (user.getLastName().length() < 3 || user.getLastName().length() > 15) {
            throw new NameUserValidationException();
        }
    }

    void ageUserValidation(User user) {
        if (user.getAge() < 0 || user.getAge() > 120) {
            throw new AgeUserValidationException();
        }
    }
}

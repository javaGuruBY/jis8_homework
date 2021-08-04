package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.bean.User;
import com.tutrit.java.quickstart.exceptions.UserValidationException;

public class UserValidationService {

    public boolean validate(User user) throws UserValidationException {
        try {
            checkUserNameLength(user);
        } catch (UserValidationException nameException) {
            return false;
        }
        try {
            checkUserAge(user);
        } catch (UserValidationException ageException) {
            return false;
        }
        return true;
    }

    public void checkUserNameLength(User user) throws UserValidationException {
        if (user.getFirstName().length() < 3 || user.getLastName().length() < 3) {
            throw new UserValidationException("First or Last name is too short");
        } else if (user.getFirstName().length() > 15 || user.getLastName().length() > 15) {
            throw new UserValidationException("First or Last name is too long");
        }
    }

    public void checkUserAge(User user) throws UserValidationException {
        if (user.getAge() < 0 || user.getAge() > 120) {
            throw new UserValidationException("Age is incorrect");
        }
    }



//    Допустимый возраст пользователя: от 0 до 120 лет включительно;
//    В случае, если данные не проходят одну из проверок, то необходимо выбросить UserValidationException с причиной ошибки.


}

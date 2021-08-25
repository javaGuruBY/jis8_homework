package com.tutrit.java.quickstart.junit;

import static com.tutrit.java.quickstart.junit.validation.Validator.validation;

public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user) throws UserValidationException {
        validation(user);
        userRepository.save(user);
    }
}

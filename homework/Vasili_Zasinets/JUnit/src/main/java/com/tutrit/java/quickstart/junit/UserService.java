package com.tutrit.java.quickstart.junit;

public class UserService {

    UserRepository userRepository = new UserRepository();

    public void addUser(User user) throws UserValidationException {
        checkUserNotNull(user);
        checkUserId(user);
        userRepository.save(user);
    }

    private void checkUserNotNull(User user) throws UserValidationException {
        if (user == null) {
            throw new UserValidationException("User must be not null");
        }
    }

    private void checkUserId(User user) throws UserValidationException {
        if (user.getId() == 0) {
            throw new UserValidationException("Id must be not null");
        }
    }
}

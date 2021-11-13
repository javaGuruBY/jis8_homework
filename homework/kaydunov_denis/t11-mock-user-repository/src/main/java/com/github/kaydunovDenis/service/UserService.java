package com.github.kaydunovDenis.service;

import com.github.kaydunovDenis.model.User;
import com.github.kaydunovDenis.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserService {
    private UserRepository users;

    public void addUser(final User user) {
        if (validateUser(user)) {
            users.save(user);
        }
    }

    private boolean validateUser(final User user) {
        return !(user.getId() == null ||
                user.getName() == null ||
                user.getName().equals("") ||
                user.getAge() == null ||
                user.getAge() <= 0);
    }
}

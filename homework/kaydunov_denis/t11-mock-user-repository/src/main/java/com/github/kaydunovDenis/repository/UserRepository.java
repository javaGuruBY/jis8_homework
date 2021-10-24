package com.github.kaydunovDenis.repository;

import com.github.kaydunovDenis.model.User;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    @Getter
    private static final Map<Long, User> USERS = new HashMap<>();

    public User save(final User user) {
        USERS.put(user.getId(), user);
        return user;
    }
}

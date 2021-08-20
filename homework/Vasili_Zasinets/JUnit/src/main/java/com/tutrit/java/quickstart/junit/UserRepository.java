package com.tutrit.java.quickstart.junit;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

   private final Map<Integer, User> users = new HashMap<>();

    public Map<Integer, User> save(User user) {
        users.put(user.getId(), user);
        return users;
    }
}

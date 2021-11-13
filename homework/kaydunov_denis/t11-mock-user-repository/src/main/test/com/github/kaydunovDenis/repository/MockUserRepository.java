package com.github.kaydunovDenis.repository;

import com.github.kaydunovDenis.model.User;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode(callSuper = true)
public class MockUserRepository extends UserRepository {
    @Getter
    private boolean isMockTriggered = false;

    @Override
    public User save(User user) {
        isMockTriggered = true;
        getUSERS().put(user.getId(), user);
        return user;
    }
}

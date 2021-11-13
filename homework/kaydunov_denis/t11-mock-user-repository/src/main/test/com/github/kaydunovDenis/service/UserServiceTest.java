package com.github.kaydunovDenis.service;

import com.github.kaydunovDenis.model.User;
import com.github.kaydunovDenis.repository.MockUserRepository;
import com.github.kaydunovDenis.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserServiceTest {
    private UserRepository userRepository;
    private UserService userService;
    private User user;

    @Before
    public void setUp() {
        userRepository = new MockUserRepository();
        userService = new UserService(userRepository);
        user = new User(1L, "Antonio", 30);
    }

    @Test
    public void addUserNegative() {
        assertFalse(((MockUserRepository) userRepository).isMockTriggered());
    }

    @Test
    public void addUserPositive() {
        userService.addUser(user);
        assertTrue(((MockUserRepository) userRepository).isMockTriggered());
    }
}

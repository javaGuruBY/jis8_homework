package com.tutrit.schedullers.service;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PersonService {

    public void getPersons() {
        log.warn("person");
    }

    public void sendEmail() {
        log.info("email has been sent");
    }
}

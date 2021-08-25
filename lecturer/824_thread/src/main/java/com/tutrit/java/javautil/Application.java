package com.tutrit.java.javautil;

import com.tutrit.java.javautil.service.AddNewClient;
import com.tutrit.java.javautil.service.RegistrationService;

public class Application {

    public static void main(String[] args) {
        Thread registrationService = new Thread(new RegistrationService());
        Thread addClientService = new Thread(new AddNewClient());
        registrationService.start();
        addClientService.start();
    }
}

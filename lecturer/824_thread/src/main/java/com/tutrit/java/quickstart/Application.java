package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.bean.Course;
import com.tutrit.java.quickstart.bean.Human;
import com.tutrit.java.quickstart.bean.IntensiveCourse;
import com.tutrit.java.quickstart.bean.Robot;
import com.tutrit.java.quickstart.service.AddNewClient;
import com.tutrit.java.quickstart.service.IntensiveRegistrationService;
import com.tutrit.java.quickstart.service.RegistrationService;

public class Application {

    public static void main(String[] args) {
        Thread registrationService = new Thread(new RegistrationService());
        Thread addClientService = new Thread(new AddNewClient());
        registrationService.start();
        addClientService.start();

        new IntensiveCourse().addClient(new Human(""));
        new Course().addClient(new Human(""));
        new Course().addClient(new Robot(""));
    }
}

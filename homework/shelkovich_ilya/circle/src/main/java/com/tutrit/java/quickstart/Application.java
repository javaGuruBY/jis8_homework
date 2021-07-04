package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.service.CircleService;

public class Application {

    public static void main(String[] args) {
        var circleService = new CircleService();

        circleService.calculateArea(5);

    }
}


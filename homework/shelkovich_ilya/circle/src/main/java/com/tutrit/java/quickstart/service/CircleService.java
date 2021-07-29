package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.bean.Circle;

public class CircleService {

    public double calculateArea(Circle circle){
        return Math.PI * (circle.getRadius() * circle.getRadius());
    }
}

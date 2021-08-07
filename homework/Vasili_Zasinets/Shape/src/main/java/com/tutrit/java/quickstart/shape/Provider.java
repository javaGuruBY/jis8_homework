package com.tutrit.java.quickstart.shape;

interface Provider {

//made the interface on the recommendation of the sonar
     AbstractShape getShape(String name, double v);
}

package com.tutrit.java.quickstart.shape.fabric;

import com.tutrit.java.quickstart.shape.AbstractShape;

interface Provider {

//made the interface on the recommendation of the sonar
     AbstractShape getShape(String name, double v);
}

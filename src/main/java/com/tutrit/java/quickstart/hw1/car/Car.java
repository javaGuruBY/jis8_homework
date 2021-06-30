package com.tutrit.java.quickstart.hw1.car;

import java.util.Objects;

public class Car {
    private String model;
    private String color;
    private double maxSpeed;
    private double curentSpeed = 99;

    public String getModel() {
        return model;
    }

    public Car(String model, String color, double maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.maxSpeed, maxSpeed) == 0 && Double.compare(car.curentSpeed, curentSpeed) == 0 && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, maxSpeed, curentSpeed);
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", curentSpeed=" + curentSpeed +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getCurentSpeed() {
        return curentSpeed;
    }

    public void setCurentSpeed(double curentSpeed) {
        this.curentSpeed = curentSpeed;
    }
}

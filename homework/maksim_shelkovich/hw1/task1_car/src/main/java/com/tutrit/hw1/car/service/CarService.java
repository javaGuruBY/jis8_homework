package com.tutrit.hw1.car.service;

import com.tutrit.hw1.car.bean.Car;

public class CarService {
    private Car car;

    public CarService(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void speedUp(int targetSpeed){
        int newSpeed = car.getCurrentSpeed() + targetSpeed;
        if(newSpeed > car.getMaxSpeed()) {
            newSpeed = car.getMaxSpeed();
        }
        car.setCurrentSpeed(newSpeed);
    }

    public void speedDown(int targetSpeed) {
        throw new UnsupportedOperationException();
    }

    public boolean isStopped() {
        throw new UnsupportedOperationException();
    }

    public boolean isDriving() {
        throw new UnsupportedOperationException();
    }

    public boolean canAccelerate() {
        throw new UnsupportedOperationException();
    }
}

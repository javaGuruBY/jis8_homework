package com.tutrit.java.quickstart.hw1.car;

public class CarService {
    private Car car;

    boolean result;

    public CarService(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }


    public void accelerate(int targetSpeed) {
        while (car.getCurentSpeed() < targetSpeed) {
            double newSpeed = car.getCurentSpeed() + 1;
            if (newSpeed > car.getMaxSpeed()) {
                newSpeed = car.getCurentSpeed();
            }
            car.setCurentSpeed(newSpeed);
            if (targetSpeed > car.getMaxSpeed()) {
                newSpeed = car.getMaxSpeed();
            }
            car.setCurentSpeed(newSpeed);
        }
    }

    public void decelerate(int targetSpeed) {
        while (car.getCurentSpeed() > targetSpeed) {
            double newSpeed = car.getCurentSpeed() - 1;
            if (targetSpeed > car.getCurentSpeed()) {
                newSpeed = car.getCurentSpeed();
            }
            car.setCurentSpeed(newSpeed);
            if (car.getCurentSpeed()==0) {
                newSpeed = car.getCurentSpeed();
            }
            car.setCurentSpeed(newSpeed);
        }
    }

    public boolean isDriving() {
        if (car.getCurentSpeed() > 0) {
            result = true;
        } else result = false;
        return result;
    };

    public boolean isStopped() {
        if (car.getCurentSpeed() == 0) {
            result = true;
        } else result = false;
        return result;
    };

    public boolean canAccelerate() {
        if (car.getCurentSpeed() < car.getMaxSpeed()) {
            result = true;
        } else result = false;
        return result;
    };
}

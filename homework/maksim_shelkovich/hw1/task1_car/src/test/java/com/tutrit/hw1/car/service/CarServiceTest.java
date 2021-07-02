package com.tutrit.hw1.car.service;

import static org.junit.Assert.*;

import com.tutrit.hw1.car.bean.Car;
import org.junit.Before;
import org.junit.Test;

public class CarServiceTest {

    CarService carService;

    @Before
    public void setUp() throws Exception {
        carService = new CarService(getDefaultCar());
    }

    @Test
    public void speedUp() {
        carService.setCar(getDefaultCar());
        carService.speedUp(90);
        assertEquals(getCar100_100(), carService.getCar());

        carService.setCar(getDefaultCar());
        carService.speedUp(91);
        assertEquals(getCar100_100(), carService.getCar());

        carService.setCar(getDefaultCar());
        carService.speedUp(89);
        assertEquals(getCar99_100(), carService.getCar());
    }

    @Test
    public void speedUp_from0_max10() {
        carService.setCar(getCarWithSpeed(0, 10));
        carService.speedUp(9);
        assertEquals(
                getCarWithSpeed(9, 10),
                carService.getCar());

        carService.setCar(getCarWithSpeed(0, 10));
        carService.speedUp(10);
        assertEquals(
                getCarWithSpeed(10, 10),
                carService.getCar());

        carService.setCar(getCarWithSpeed(0, 10));
        carService.speedUp(11);
        assertEquals(
                getCarWithSpeed(10, 10),
                carService.getCar());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void speedDown() {
        carService.speedDown(1);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void isStopped() {
        carService.isStopped();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void isDriving() {
        carService.isDriving();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void canAccelerate() {
        carService.canAccelerate();
    }

    private Car getDefaultCar() {
        Car car = new Car();
        car.setColor("blue");
        car.setModel("bmw");
        car.setCurrentSpeed(10);
        car.setMaxSpeed(100);
        return car;
    }

    private Car getCarWithSpeed(int currentSpeed, int maxSpeed) {
        Car car = new Car();
        car.setColor("blue");
        car.setModel("bmw");
        car.setCurrentSpeed(currentSpeed);
        car.setMaxSpeed(maxSpeed);
        return car;
    }

    private Car getCar100_100() {
        Car car = new Car();
        car.setColor("blue");
        car.setModel("bmw");
        car.setCurrentSpeed(100);
        car.setMaxSpeed(100);
        return car;
    }

    private Car getCar99_100() {
        Car car = new Car();
        car.setColor("blue");
        car.setModel("bmw");
        car.setCurrentSpeed(99);
        car.setMaxSpeed(100);
        return car;
    }
}
package com.codecool.f1teammanager.car;

import com.codecool.f1teammanager.employee.Driver;

public class Car {

    private CarParts carParts;
    private Driver driver = null;

    public Car(int carPartAmount) {
        this.carParts = new CarParts(carPartAmount);
    }

    public CarParts getCarParts() {
        return carParts;
    }


    public Driver getDriver() {
        return driver;
    }

    public void removeParts(int amount){
        carParts.setAmount(amount);
    }

    public void buyCarParts(int amount){
        carParts.setAmount(amount);
    }

    public void setDriver(Driver driver){
        this.driver = driver;
    }
}

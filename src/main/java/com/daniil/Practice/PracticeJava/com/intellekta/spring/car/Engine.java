package com.daniil.Practice.PracticeJava.com.intellekta.spring.car;

import org.springframework.stereotype.Component;

@Component("engineId")
public class Engine {

    private int capacity;
    private int horsePower;
    private int numberOfCylinders;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }
}

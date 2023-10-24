package com.daniil.Practice.PracticeJava.com.intellekta.spring.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "tester")
public class ClassTester {
    private String carInfo;
    private boolean goodCar;
    private boolean greatCar;

    private Car car;
    private Engine engine;

    public String getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }

    public boolean isGoodCar() {
        return goodCar;
    }

    public void setGoodCar(boolean goodCar) {
        this.goodCar = goodCar;
    }

    public boolean isGreatCar() {
        return greatCar;
    }

    public void setGreatCar(boolean greatCar) {
        this.greatCar = greatCar;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}

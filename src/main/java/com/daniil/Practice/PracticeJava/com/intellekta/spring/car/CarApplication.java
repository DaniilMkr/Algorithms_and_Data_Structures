package com.daniil.Practice.PracticeJava.com.intellekta.spring.car;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassTester car = applicationContext.getBean(ClassTester.class);
        System.out.println(car.isGoodCar());
        System.out.println(car.isGreatCar());
        System.out.println(car.getCarInfo());



    }



}

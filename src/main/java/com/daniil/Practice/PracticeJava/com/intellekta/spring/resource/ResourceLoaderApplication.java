package com.daniil.Practice.PracticeJava.com.intellekta.spring.resource;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ResourceLoaderApplication {
    public static void main(String[] args) {

        SpringApplication.run(ResourceLoaderService.class, args);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("users.xml");

        ResourceLoaderService resourceLoaderService = applicationContext.getBean(ResourceLoaderService.class);
        resourceLoaderService.showResourceDataUsingFilePath();
    }
}

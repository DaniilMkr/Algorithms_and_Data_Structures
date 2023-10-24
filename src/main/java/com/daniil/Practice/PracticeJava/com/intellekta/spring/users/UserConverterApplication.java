package com.daniil.Practice.PracticeJava.com.intellekta.spring.users;


import com.daniil.Practice.PracticeJava.com.intellekta.spring.resource.ResourceLoaderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class UserConverterApplication {
    public static void main(String[] args) {

        SpringApplication.run(UserFactory.class, args);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("usersToValidate.xml");

        UserFactory userFactory = (UserFactory) applicationContext.getBean("userFactory");
        userFactory.convert("users.txt");

    }
}

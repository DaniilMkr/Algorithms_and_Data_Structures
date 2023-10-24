package com.daniil.Practice.PracticeJava.com.intellekta.spring.articleSite;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@EnableAspectJAutoProxy
@Configuration
public class AopDeveloperRunner {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("developer.xml");
        Developer developer = applicationContext.getBean(Developer.class);
        System.out.println(developer);
    }

}

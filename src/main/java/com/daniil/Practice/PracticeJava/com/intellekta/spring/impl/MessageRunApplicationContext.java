package com.daniil.Practice.PracticeJava.com.intellekta.spring.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRunApplicationContext {

    public static void main(String[] args) {
        ApplicationContext xmlConfigContext = new ClassPathXmlApplicationContext("message-bean.xml");

        Message message = xmlConfigContext.getBean(Message.class);
        System.out.println(message.getMessage());
    }

}

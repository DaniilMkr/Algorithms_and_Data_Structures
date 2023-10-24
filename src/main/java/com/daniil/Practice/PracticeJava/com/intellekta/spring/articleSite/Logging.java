package com.daniil.Practice.PracticeJava.com.intellekta.spring.articleSite;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging {

    @Pointcut("execution(* com.daniil.Practice.PracticeJava.com.intellekta.spring.articleSite.*.*(..))")
    public void selectAllMethods(){};

    @Before("selectAllMethods()")
    public void beforeAdvice() {
        System.out.println("Starting to initiate developer`s profile");
    }
    @After("selectAllMethods()")
    public void afterAdvice() {
        System.out.println("Profile has been initiated");
    }
}

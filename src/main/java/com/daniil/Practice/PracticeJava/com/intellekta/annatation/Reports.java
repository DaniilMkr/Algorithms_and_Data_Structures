package com.daniil.Practice.PracticeJava.com.intellekta.annatation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyReportRepeated.class)
@interface ToRelease {
    String customerName();
    int version();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyReportRepeated {
    ToRelease[] value();
}


public class Reports {
    @ToRelease(customerName = "Div_5", version =  5)
    @ToRelease(customerName = "Div_2", version = 0)
    public static void report() {
        System.out.println(Reports.class.getMethods()[0]);
    }

}

package com.daniil.Practice.PracticeJava.com.intellekta.annatation;

public class Main {
    public static void main(String[] args) {
        Object index = new String("333");
        Object age = new Integer(25);
        Object salary = new Long(100);
        index = null;
        index = salary;
        salary = age;
        age = index;

        System.gc();



    }
}

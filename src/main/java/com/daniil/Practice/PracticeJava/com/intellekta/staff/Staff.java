package com.daniil.Practice.PracticeJava.com.intellekta.staff;

public interface Staff {
    default int calculateSalary(int salary){
        if (salary < 0) {
            return 0;
        }
        return salary;
    };
}
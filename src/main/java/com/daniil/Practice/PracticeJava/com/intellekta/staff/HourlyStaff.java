package com.daniil.Practice.PracticeJava.com.intellekta.staff;

public class HourlyStaff implements Staff {

    private int workTime;

    public int getWorkTime() {
        return workTime;
    }

    public HourlyStaff(int workTime) {
        if (workTime >= 4 && workTime <= 10){
            this.workTime = workTime;
        }
        else this.workTime = 0;

    }

    @Override
    public int calculateSalary(int salary) {
//        if (salary < 0) {
//            return 0;
//        }
        return Staff.super.calculateSalary(salary) * getWorkTime();

    }
}
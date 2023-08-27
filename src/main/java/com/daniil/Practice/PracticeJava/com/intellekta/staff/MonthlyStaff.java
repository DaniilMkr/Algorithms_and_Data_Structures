package com.daniil.Practice.PracticeJava.com.intellekta.staff;

public class MonthlyStaff implements Staff {
    private int workDays;
    private int premium;

    public int getWorkDays() {
        return workDays;
    }

    public int getPremium() {
        return premium;
    }

    public MonthlyStaff(int workdays, int premium) {
        this.workDays = workdays;
        this.premium = premium;
        if (workdays <= 0 ||workdays >= 30) {
            this.workDays = 0;
        }
        if (premium < 0 || premium > 10000) {
            this.premium = 0;
        }

    }

    @Override
    public int calculateSalary(int salary) {
        if (salary < 0) {
            return 0;
        }
        return salary * getWorkDays() + getPremium();
    }
}
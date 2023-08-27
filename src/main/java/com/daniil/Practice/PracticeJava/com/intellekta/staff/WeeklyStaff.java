package com.daniil.Practice.PracticeJava.com.intellekta.staff;

public class WeeklyStaff extends MonthlyStaff implements Staff {

    private int workWeeks;

    public int getWorkWeeks() {
        return workWeeks;
    }

    public WeeklyStaff(int workdays, int premium, int workWeeks) {
        super(workdays, premium);
        if (workdays >= 2 && workdays <= 4){
            this.workWeeks = workWeeks;
        }
        else this.workWeeks = 0;

    }

    @Override
    public int calculateSalary(int salary) {
        if (salary < 0) {
            return 0;
        }
        return getWorkWeeks() * salary;
    }

    void printYearSalary(int salary) {
        System.out.println(getWorkWeeks() * calculateSalary(salary) * 26);
    }
}
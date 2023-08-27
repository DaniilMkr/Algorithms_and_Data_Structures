package com.daniil.Practice.PracticeJava.com.intellekta.staff;

public class Main {
    public static void main(String[] args) {
        Staff hourlyStaff = new HourlyStaff(10);
        System.out.println(hourlyStaff.calculateSalary(-10));

        Staff monthlyStaff = new MonthlyStaff(10,10);
        System.out.println(monthlyStaff.calculateSalary(-1));

        Staff weeklyStaff = new WeeklyStaff(3, 10, 10);
        System.out.println(weeklyStaff.calculateSalary(-1));
    }
}

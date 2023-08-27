package com.daniil.Practice.PracticeJava.com.intellekta.randommoney;

import java.util.Random;
public class RandomMoney {
    private double price;
    public double getPrice() {
        return price;
    }
    public void sale(int number, int time) {
        double price = 5*Math.sin(0.5 * time);
        this.price = price;
        double value = getPrice() * number;
        String formattedString = String.format("%.2f", value);
        if (value > 0) {
            System.out.print("The company has earned USD " + formattedString);
        }
        else if (value == 0) {
            System.out.print("The company did not earn anything and did not lose on the sale");
        }
        else if (value < 0) {
            System.out.print("The company has lost USD " + formattedString);
        }
    }
    public void testSale() {
        sale(new Random().nextInt(), new Random().nextInt(0,50));
        sale(new Random().nextInt(), new Random().nextInt(0,50));
        sale(new Random().nextInt(), new Random().nextInt(0,50));
    }
}

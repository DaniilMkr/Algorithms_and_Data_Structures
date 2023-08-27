package com.daniil.HashTable.HashingQuadraticProbing.luxArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    private static ArrayList<Customer> shopCustomers;

    public void printShopSummary() {
        for (Customer customer : shopCustomers) {
            if (customer instanceof CardCustomer) {
                ((CardCustomer) customer).customerInfo();
            } else if (customer instanceof CashCustomer) {
                ((CashCustomer) customer).customerInfo();
            }
        }
    }

    public static ArrayList<Customer> createShopInfo() {
        Scanner scanner = new Scanner(System.in);
        boolean quit = true;
        while (quit) {
            if (shopCustomers == null) {
                shopCustomers = new ArrayList<>();
            }
            System.out.println("Shop data \n");
            String input = scanner.nextLine();
            String[] splitString = input.split(",", 5);
            if (splitString[0].equals("exit")) {
                quit = false;
                break;
            }
            if (Integer.parseInt(splitString[0]) == 1) {
                CashCustomer cashCustomer = new CashCustomer(splitString[1], splitString[2], Integer.parseInt(splitString[3]));
                cashCustomer.getDiscountSize();
                shopCustomers.add(cashCustomer);
            } else if (Integer.parseInt(splitString[0]) == 2) {
                CardCustomer cardCustomer = new CardCustomer(splitString[1], splitString[2], Integer.parseInt(splitString[3]));
                shopCustomers.add(cardCustomer);
            }
        }
        return shopCustomers;
    }

    public static void main(String[] args) {

    }
}

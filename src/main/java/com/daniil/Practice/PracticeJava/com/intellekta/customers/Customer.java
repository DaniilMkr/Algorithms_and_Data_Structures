package com.daniil.Practice.PracticeJava.com.intellekta.customers;

public abstract class Customer {
    private int purchaseCount;
    private double discountSize;
    private String name;

    public Customer(String name, int purchaseCount) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            this.name = "No-name";
        }
        else {
            this.name = name;
        }
        if (purchaseCount < 0) {
            this.purchaseCount = 0;
        }
        else {
            this.purchaseCount = purchaseCount;
        }
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public abstract void customerInfo();

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
        if (purchaseCount < 0) {
            System.out.println("Purchase count must be more or equal to zero");
        }
        else {
            if (discountSize < 0) {
                System.out.println("Discount must be positive number");
            }
            else if (purchaseCount < 5 && purchaseCount > 0) {
                this.discountSize = Discount.ZERO * 100;
            }
            else if (purchaseCount > 4 && purchaseCount < 10) {
                this.discountSize = Discount.FIVE * 100;
            }
            else if (purchaseCount > 9 && purchaseCount < 15) {
                this.discountSize = Discount.TEN * 100;
            }else {
                this.discountSize = Discount.TWENTY * 100;
            }
        }
    }
    public double getDiscountSize() {
        if (this.purchaseCount == 0) {
            return discountSize;
        }
        else setPurchaseCount(this.purchaseCount);
        return discountSize;
    }

    public String getName() {
        return name;
    }

    public static final class Discount {
        public static final double ZERO = 0;
        public static final double FIVE = 0.05;
        public static final double TEN = 0.1;
        public static final double TWENTY = 0.2;
    }
}

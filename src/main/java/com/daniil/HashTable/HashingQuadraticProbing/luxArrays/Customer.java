package com.daniil.HashTable.HashingQuadraticProbing.luxArrays;

public abstract class Customer {
    private int purchaseCount;
    private int discountSize;
    private String name;

    public Customer(String name, int purchaseCount) {
        this.name = name;
        this.purchaseCount = purchaseCount;
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

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
                this.discountSize = Discount.ZERO;
            }
            else if (purchaseCount > 4 && purchaseCount < 10) {
                this.discountSize = Discount.FIVE;
            }
            else if (purchaseCount > 9 && purchaseCount < 15) {
                this.discountSize = Discount.TEN;
            }else {
                this.discountSize = Discount.TWENTY;
            }
        }
    }
    public int getDiscountSize() {
        if (this.purchaseCount == 0) {
            return discountSize;
        }
        else setPurchaseCount(this.purchaseCount);
        return discountSize;
    }

    public String getName() {
        if (this.name.isBlank() || this.name.isEmpty()) {
            return "No-name";
        }
        else return name;
    }

    public static final class Discount {
        public static final int ZERO = 0;
        public static final int FIVE = 5;
        public static final int TEN = 10;
        public static final int TWENTY = 20;
    }
}

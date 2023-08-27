package com.daniil.HashTable.HashingQuadraticProbing.luxArrays;

public class CardCustomer extends Customer implements Info {
    private String cardNumber;
    public CardCustomer(String name, String cardNumber, int purchaseCount) {
        super(name, purchaseCount);
        if (cardNumber.length() != 16) {
            this.cardNumber = "0".repeat(16);
        } else {
            this.cardNumber = cardNumber;
        }
    }

    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public void customerInfo() {
        String string = "Customer " + getName() + " (card: " + getCardNumber() + ") " +
                "has a discount " + getDiscountSize() + " %" + "\n";
        System.out.println(string);
    }
}



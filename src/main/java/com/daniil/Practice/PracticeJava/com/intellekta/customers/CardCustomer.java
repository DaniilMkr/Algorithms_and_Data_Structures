package com.daniil.Practice.PracticeJava.com.intellekta.customers;

public class CardCustomer extends Customer {
    private String cardNumber;
    public CardCustomer(String name, String cardNumber, int purchaseCount) {
        super(name, purchaseCount);
        if (cardNumber == null) {
            this.cardNumber = "0".repeat(16);
        }
        else if  (cardNumber.length() != 16 || !cardNumber.matches("\\d+") ) {
            this.cardNumber = "0".repeat(16);
        }
        else {
            this.cardNumber = cardNumber;
        }
    }

    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public void customerInfo() {
        String string = "Customer " + getName() + " (card: " + getCardNumber() + ") " +
                "has a discount " + (int)getDiscountSize() + " %" + "\n";
        System.out.println(string);
    }
}
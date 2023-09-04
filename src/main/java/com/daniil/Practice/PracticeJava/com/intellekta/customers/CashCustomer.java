package com.daniil.Practice.PracticeJava.com.intellekta.customers;

public class CashCustomer extends Customer {
    private String documentNumber;

    public CashCustomer(String name, String documentNumber, int purchaseCount) {
        super(name, purchaseCount);
        if (documentNumber == null) {
            this.documentNumber = "0000 000000";
        }
        else if (documentNumber.length() != 11 || !documentNumber.matches("\\d+")) {
            this.documentNumber = "0000 000000";
        }
        else {
            this.documentNumber = documentNumber;
        }
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    @Override
    public void customerInfo() {
        String string = "Customer " + getName() + " (passport: " + getDocumentNumber() + ") " +
                "has a discount " + (int)getDiscountSize() + " %" + "\n";
        System.out.println(string);
    }
}
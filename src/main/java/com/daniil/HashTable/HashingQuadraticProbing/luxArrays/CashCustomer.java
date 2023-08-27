package com.daniil.HashTable.HashingQuadraticProbing.luxArrays;

public class CashCustomer extends Customer implements Info {
    private String documentNumber;

    public CashCustomer(String name, String documentNumber, int purchaseCount) {
        super(name, purchaseCount);
        if (documentNumber.length() != 11) {
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
                "has a discount " + getDiscountSize() + " %" + "\n";
        System.out.println(string);
    }
}

package com.daniil.Practice.PracticeJava.com.intellekta.transaction;

public class Transaction {

    private double price;
    private double tax = 1.2;


    public double getPrice() {
        return price;
    }

    public double dealPrice() {
        return price * tax;
    }

    private void printCheck(double price) {
        System.out.println(String.format("%.2f", price) + ": USD");
    }

    public void printCheck() {
        System.out.println("Order price " + getPrice() + " USD\n" + "Total price: " + dealPrice() + " USD");
    }


      class TransactionItem extends ProductInfo {
          private double price;
          private String name;


         Transaction getTransaction() {
             return Transaction.this;

         }

         public TransactionItem(String name, double price) {
             if (name.isEmpty() || name.isBlank()) {
                 this.name = "Default";
             }
             else if (price < 0) {
                 this.price = 0;
             }
             else {
                 this.price = this.price + price;
                 getTransaction().price+= price;
             }
         }
         void printInfo(){
             System.out.printf("Item: " + name + ",");
             printCheck(price);
         }
     }
}

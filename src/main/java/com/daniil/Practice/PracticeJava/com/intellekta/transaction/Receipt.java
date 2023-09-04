package com.daniil.Practice.PracticeJava.com.intellekta.transaction;

public class Receipt {

    public static void printReceipt(ProductInfo[] transactions) {
        Transaction transaction = new Transaction();
//        Transaction.TransactionItem transactionItem = transaction.new TransactionItem(transactions[i].name, transactions[i].price);
//        transactionItem.printInfo();
        }


        public static void printTransactionInfo(Transaction.TransactionItem transaction) {
        transaction.getTransaction().printCheck();

    }
}

package model;

// Tính trừu tượng
public abstract class Transaction {
    protected String accountNumber;
    protected double amount;
    public Transaction(String accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public abstract void processTransaction();
    public abstract void printTransactionDetails();


}

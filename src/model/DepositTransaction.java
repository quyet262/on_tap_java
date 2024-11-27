package model;

public class DepositTransaction extends Transaction {
    private BankAccount account;

    public DepositTransaction(BankAccount account, double amount) {
        super(account.getAccountNumber(), amount);
        this.account = account;
    }

    // Tính đa hình
    @Override
    public void processTransaction() {
        account.setBalance(account.getBalance() + amount);
    }

    // Tính đa hình
    @Override
    public void printTransactionDetails() {
        System.out.println("Tài khoản giao dịch: " + accountNumber + ", Số tiền: " + amount);
    }
}

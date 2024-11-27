package model;

public class WithdrawTransaction extends Transaction {
    private BankAccount account;

    public WithdrawTransaction(BankAccount account, double amount) {
        super(account.getAccountNumber(), amount);
        this.account = account;
    }

    // Tính đa hình
    @Override
    public void processTransaction() {
        if (account.withdraw(amount)) {
            System.out.println("Rút tiền thành công!");
        } else {
            System.out.println("Rút tiền không thành công!");
        }
    }

    // Tính đa hình
    @Override
    public void printTransactionDetails() {
        System.out.println("Tài khoản giao dịch: " + accountNumber + ", Số tiền: " + amount);
    }
}


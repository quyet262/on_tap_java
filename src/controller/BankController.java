package controller;

import model.BankAccount;
import model.Transaction;
import view.BankView;

import java.util.ArrayList;
import java.util.List;

public class BankController {
    private List<BankAccount> accounts;
    private BankView view;

    public BankController(BankView view) {
        this.view = view;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
        view.displayMessage("Đã thêm tài khoản: " + account.getAccountDetails());
    }

    public void performTransaction(Transaction transaction) {
        transaction.processTransaction();
        transaction.printTransactionDetails();
    }

    public void showAllAccounts() {
        view.displayAccounts(accounts);
    }
}


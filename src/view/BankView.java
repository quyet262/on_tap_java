package view;

import model.BankAccount;

import java.util.List;

public class BankView {
    public void displayAccounts(List<BankAccount> accounts) {
        System.out.println("Chi tiết tài khoản:");
        for (BankAccount account : accounts) {
            System.out.println(account.getAccountDetails());
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}


import controller.BankController;
import model.*;
import view.BankView;


public class Main {
    public static void main(String[] args) {

        BankView view = new BankView();
        BankController controller = new BankController(view);

        BankAccount savings = new SavingAccount("12345", "Quyet", 5000, 0.05);
        BankAccount checking = new CheckingAccount("67890", "Nguyen", 2000, 1000);

        controller.addAccount(savings);
        controller.addAccount(checking);

        controller.performTransaction(new DepositTransaction(savings, 1000));
        controller.performTransaction(new WithdrawTransaction(checking, 2500));

        controller.showAllAccounts();
    }
}

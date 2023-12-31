package Question3.Banking;
import java.util.ArrayList;
import java.util.List;

public class Bank 
{
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void openAccount(Account account) {
        accounts.add(account);
        System.out.println("Opened a new account: " + account);
    }

    public void closeAccount(Account account) {
        accounts.remove(account);
        System.out.println("Closed account: " + account);
    }

    public void payDividend(double dividend) {
        for (Account account : accounts) {
            account.deposit(dividend);
        }
    }

    public void update() {
        for (Account account : accounts) {
            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).addInterest();
            } else if (account instanceof CurrentAccount) {
                if (account.getBalance() < 0) {
                    System.out.println("Letter sent for overdraft on Current Account #" + account.getAccountNumber());
                }
            }
        }
    }
}

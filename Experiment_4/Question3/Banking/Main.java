package Question3.Banking;

public class Main {
    public static void main(String[] args) 
    {
        
        SavingsAccount savingsAccount = new SavingsAccount(1, "John", 1000, 3.5);
        CurrentAccount currentAccount = new CurrentAccount(2, "Alice", 2000, 500);
        Account normalAccount = new Account(3, "Bob", 1500);

        Bank bank = new Bank();
        bank.openAccount(savingsAccount);
        bank.openAccount(currentAccount);
        bank.openAccount(normalAccount);

        savingsAccount.deposit(500);
        currentAccount.withdraw(1000);
        normalAccount.withdraw(200);

        bank.payDividend(50);

        bank.update();

        normalAccount.toString();
    }
}

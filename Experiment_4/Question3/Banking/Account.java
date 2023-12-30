package Question3.Banking;

class Account 
{
    private int accountNumber;
    private String accountHolder;
    protected double balance;

    public Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into Account #" + accountNumber);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from Account #" + accountNumber);
        } else {
            System.out.println("Insufficient funds in Account #" + accountNumber);
        }
    }

    @Override
    public String toString() {
        return "Account #" + accountNumber + " (" + accountHolder + "): $" + balance;
    }
}

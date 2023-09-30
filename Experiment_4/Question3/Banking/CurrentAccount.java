package Question3.Banking;
class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from Current Account #" + getAccountNumber());
            if (balance < 0) {
                System.out.println("Account #" + getAccountNumber() + " is in overdraft.");
            }
        } else {
            System.out.println("Insufficient funds in Current Account #" + getAccountNumber());
        }
    }

    @Override
    public String toString() {
        return super.toString() + " (Overdraft Limit: $" + overdraftLimit + ")";
    }
}

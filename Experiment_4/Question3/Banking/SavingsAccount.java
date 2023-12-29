package Question3.Banking;

class SavingsAccount extends Account 
{
    private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interestAmount = balance * interestRate / 100;
        deposit(interestAmount);
        System.out.println("Interest added to Account #" + getAccountNumber() + ": $" + interestAmount);
    }

    @Override
    public String toString() {
        return super.toString() + " (Interest Rate: " + interestRate + "%)";
    }
}


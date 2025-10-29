interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { if (balance >= amount) balance -= amount; }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() { return getBalance() * 0.04; }
    public void applyForLoan(double amount) { System.out.println("Applied for Savings Loan: " + amount); }
    public boolean calculateLoanEligibility() { return getBalance() > 10000; }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() { return getBalance() * 0.02; }
    public void applyForLoan(double amount) { System.out.println("Applied for Current Loan: " + amount); }
    public boolean calculateLoanEligibility() { return getBalance() > 20000; }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = {
                new SavingsAccount("S101", "Yash Sharma", 15000),
                new CurrentAccount("C202", "Riya Verma", 25000)
        };

        for (BankAccount a : accounts) {
            System.out.println(a.getHolderName() + " | Interest: " + a.calculateInterest());
            ((Loanable)a).applyForLoan(50000);
            System.out.println("Eligible: " + ((Loanable)a).calculateLoanEligibility());
            System.out.println("----------------");
        }
    }
}

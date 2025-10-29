class Bank {
    private String bankName;

    public Bank(String bankName) { this.bankName = bankName; }

    public void openAccount(Customer customer, double initialBalance) {
        customer.setAccountBalance(initialBalance);
        System.out.println(customer.getName() + " opened an account at " + bankName);
    }

    public String getBankName() { return bankName; }
}

class Customer {
    private String name;
    private double accountBalance;
    private Bank bank;

    public Customer(String name, Bank bank) {
        this.name = name;
        this.bank = bank;
    }

    public String getName() { return name; }
    public void setAccountBalance(double balance) { this.accountBalance = balance; }
    public void viewBalance() { System.out.println(name + "'s balance: " + accountBalance); }
}

public class BankAssociation {
    public static void main(String[] args) {
        Bank b1 = new Bank("HDFC Bank");
        Bank b2 = new Bank("SBI Bank");

        Customer c1 = new Customer("Yash", b1);
        Customer c2 = new Customer("Riya", b2);

        b1.openAccount(c1, 20000);
        b2.openAccount(c2, 15000);

        c1.viewBalance();
        c2.viewBalance();
    }
}

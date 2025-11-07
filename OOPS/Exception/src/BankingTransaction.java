import java.util.Random;

// Custom Exceptions
class NegativeAmountException extends Exception {
    public NegativeAmountException(String msg) {
        super(msg);
    }
}

class InsufficientFundsException2 extends Exception {
    public InsufficientFundsException2(String msg) {
        super(msg);
    }
}

class NetworkFailureException extends Exception {
    public NetworkFailureException(String msg) {
        super(msg);
    }
}

class Transaction {
    private int balance = 5000;

    public void process(int amount) throws NegativeAmountException, InsufficientFundsException2, NetworkFailureException {
        Random rand = new Random();
        int result = rand.nextInt(3); // 0,1,2

        if (amount < 0)
            throw new NegativeAmountException("Amount cannot be negative!");
        else if (amount > balance)
            throw new InsufficientFundsException2("Insufficient balance! Your balance is ₹" + balance);
        else if (result == 2)
            throw new NetworkFailureException("Network error! Please try again later.");
        else
            System.out.println("Transaction successful! Remaining balance: ₹" + (balance - amount));
    }
}

public class BankingTransaction {
    public static void main(String[] args) {
        Transaction t = new Transaction();

        try {
            t.process(6000); // You can test with various amounts
        } catch (NegativeAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException2 e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NetworkFailureException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

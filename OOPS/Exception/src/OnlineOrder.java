import java.util.Random;

// Custom Exceptions
class OutOfStockException extends Exception {
    public OutOfStockException(String msg) {
        super(msg);
    }
}

class PaymentFailedException extends Exception {
    public PaymentFailedException(String msg) {
        super(msg);
    }
}

class OrderSystem {
    public void placeOrder() throws OutOfStockException, PaymentFailedException {
        Random rand = new Random();
        int result = rand.nextInt(3); // 0,1,2

        if (result == 0)
            throw new OutOfStockException("Product is out of stock!");
        else if (result == 1)
            throw new PaymentFailedException("Payment processing failed!");
        else
            System.out.println("Order placed successfully! 🎉");
    }
}

public class OnlineOrder {
    public static void main(String[] args) {
        OrderSystem order = new OrderSystem();
        try {
            order.placeOrder();
        } catch (OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

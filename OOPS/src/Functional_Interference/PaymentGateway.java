package Functional_Interference;

public class PaymentGateway {

}

interface PaymentProcessor {
    void processPayment();
    default void refund() {
        System.out.println("Default refund processed.");
    }
}

class PayPal implements PaymentProcessor {
    public void processPayment() { System.out.println("PayPal payment processed."); }
}

class Demo {
    public static void main(String[] args) {
        PayPal p = new PayPal();
        p.processPayment();
        p.refund();
    }
}

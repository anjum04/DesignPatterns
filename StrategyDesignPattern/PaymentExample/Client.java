package StrategyDesignPattern.PaymentExample;

public class Client {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Using Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        context.payAmount(1500);

        // Switching to UPI
        context.setPaymentStrategy(new UpiPayment("zeeshan@upi"));
        context.payAmount(800);

        // Switching to PayPal
        context.setPaymentStrategy(new PaypalPayment("zeeshan@gmail.com"));
        context.payAmount(2000);
    }
}

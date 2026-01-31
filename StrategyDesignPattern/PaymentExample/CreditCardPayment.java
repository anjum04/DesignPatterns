package StrategyDesignPattern.PaymentExample;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    public CreditCardPayment(String cardNumber){
        this.cardNumber=cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment of:"+amount + "is done using credit card "+cardNumber);
    }
}

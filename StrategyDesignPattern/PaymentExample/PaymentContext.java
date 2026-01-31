package StrategyDesignPattern.PaymentExample;

public class PaymentContext {
      PaymentStrategy strategy;
      public void setPaymentStrategy(PaymentStrategy strategy){
          this.strategy=strategy;
      }

    public void payAmount(double amount) {
        if (strategy == null) {
            throw new IllegalStateException("Payment strategy not set.");
        }
        strategy.pay(amount);
    }
}

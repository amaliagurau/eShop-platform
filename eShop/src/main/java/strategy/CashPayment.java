package strategy;

public class CashPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid with Cash: $" + amount);
    }
}
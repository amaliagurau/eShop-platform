package strategy;

//Strategy: Defines a family of algorithms (payment strategies) and makes them interchangeable. The Order class accepts a PaymentStrategy parameter, allowing clients to choose different payment methods.

public interface PaymentStrategy {
    void pay(double amount);
}
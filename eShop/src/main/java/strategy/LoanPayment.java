package strategy;

public class LoanPayment implements PaymentStrategy {
    private int numberOfMonths;

    public LoanPayment(int numberOfMonths) {
        this.numberOfMonths = numberOfMonths;
    }

    @Override
    public void pay(double amount) {
        double monthlyPayment = amount / numberOfMonths;
        System.out.println("Paid with Loan (monthly payment for " + numberOfMonths + " months): $" + monthlyPayment);
    }
}
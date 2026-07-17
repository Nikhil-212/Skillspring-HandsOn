public interface PaymentStrategy {
    // Each payment type implements this common operation.
    void pay(double amount);
}

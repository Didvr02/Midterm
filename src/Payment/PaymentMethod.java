package Payment;
/**
 * PaymentMethod interface defines the basic methods for all payment methods.
 * Used in the Factory Method and Adapter patterns.
 */
public interface PaymentMethod {
    Transaction processPayment(double amount, PaymentDetails details);
}
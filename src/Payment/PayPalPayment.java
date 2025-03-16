package Payment;

/**
 * PayPalPayment class implements the PaymentMethod interface.
 * A concrete class created by the Factory Method.
 */
public class PayPalPayment implements PaymentMethod {
    @Override
    public Transaction processPayment(double amount, PaymentDetails details) {
        // Mock PayPal API
        if (!details.getDetails().contains("@")) {
            return new Transaction("PP-" + System.currentTimeMillis(), amount, TransactionStatus.FAILED, "Invalid PayPal email");
        }
        return new Transaction("PP-" + System.currentTimeMillis(), amount, TransactionStatus.COMPLETED, "PayPal payment successful");
    }
}
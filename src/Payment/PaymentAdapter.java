package Payment;

/**
 * PaymentAdapter class implements the Adapter pattern.
 * Adapts an external service to the PaymentMethod interface.
 */
public class PaymentAdapter implements PaymentMethod {
    private ExternalPaymentService externalService;

    /**
     * Constructor to create a PaymentAdapter object.
     * @param externalService The ExternalPaymentService object.
     */
    public PaymentAdapter(ExternalPaymentService externalService) {
        this.externalService = externalService;
    }

    @Override
    public Transaction processPayment(double amount, PaymentDetails details) {
        boolean success = externalService.validatePayment(details.getDetails());
        if (success) {
            return new Transaction("AD-" + System.currentTimeMillis(), amount, TransactionStatus.COMPLETED, "External payment successful");
        } else {
            return new Transaction("AD-" + System.currentTimeMillis(), amount, TransactionStatus.FAILED, "External payment failed");
        }
    }
}
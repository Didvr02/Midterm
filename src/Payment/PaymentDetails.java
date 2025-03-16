package Payment;

/**
 * PaymentDetails class stores payment details.
 */
public class PaymentDetails {
    private String details;
    /**
     * Constructor to create payment details.
     * @param details The payment details.
     */
    public PaymentDetails(String details) {
        this.details = details;
    }
    /**
     * Returns the payment details.
     * @return The payment details.
     */
    public String getDetails() {
        return details;
    }
}
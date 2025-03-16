package Payment;
/**
 * ExternalPaymentService class simulates an external payment service.
 */
public class ExternalPaymentService {

    /**
     * Validates payment details.
     * @param details The payment details.
     * @return True if valid, false otherwise.
     */
    public boolean validatePayment(String details) {
        return details.length() > 5; // Simple mock validation
    }
}
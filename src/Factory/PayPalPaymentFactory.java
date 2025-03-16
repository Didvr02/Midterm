package Factory;

import Payment.PayPalPayment;
import Payment.PaymentMethod;

/**
 * PayPalPaymentFactory class implements the PaymentFactory interface.
 * Creates PayPalPayment objects.
 */
public class PayPalPaymentFactory implements PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new PayPalPayment();
    }
}
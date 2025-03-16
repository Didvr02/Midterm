package Factory;

import Payment.PaymentMethod;

/**
 * PaymentFactory interface implements the Factory Method pattern.
 * Creates PaymentMethod objects.
 */
public interface PaymentFactory {
    PaymentMethod createPaymentMethod();
}
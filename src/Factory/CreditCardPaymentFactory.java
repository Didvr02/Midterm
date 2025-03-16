package Factory;

import Payment.BankAccount;
import Payment.CreditCardPayment;
import Payment.PaymentMethod;

/**
 * CreditCardPaymentFactory class implements the PaymentFactory interface.
 * Creates CreditCardPayment objects.
 */
public class CreditCardPaymentFactory implements PaymentFactory {
    private BankAccount bankAccount;

    /**
     * Constructor to create a CreditCardPaymentFactory object.
     * @param bankAccount The BankAccount object.
     */
    public CreditCardPaymentFactory(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public PaymentMethod createPaymentMethod() {
        return new CreditCardPayment(bankAccount);
    }
}
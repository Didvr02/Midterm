package Payment;

/**
 * CreditCardPayment class implements the PaymentMethod interface.
 * A concrete class created by the Factory Method.
 */
public class CreditCardPayment implements PaymentMethod {
    private BankAccount bankAccount;

    /**
     * Constructor to create a CreditCardPayment object.
     * @param bankAccount The BankAccount object.
     */
    public CreditCardPayment(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public Transaction processPayment(double amount, PaymentDetails details) {
        // Mock credit card validation
        if (details.getDetails().length() < 16) {
            return new Transaction("CC-" + System.currentTimeMillis(), amount, TransactionStatus.FAILED, "Неверные данные карты");
        }

        try {
            bankAccount.withdraw(amount);
            return new Transaction("CC-" + System.currentTimeMillis(), amount, TransactionStatus.COMPLETED, "Оплата картой прошла успешно");
        } catch (IllegalArgumentException e) {
            return new Transaction("CC-" + System.currentTimeMillis(), amount, TransactionStatus.FAILED, e.getMessage());
        }
    }
    public double getBalance() {
        return bankAccount.getBalance();
    }
}
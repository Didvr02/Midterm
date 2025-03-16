package Payment;

/**
 * BankAccount class represents a bank account with a balance.
 */
public class BankAccount {
    private double balance;
    /**
     * Constructor to create a bank account with an initial balance.
     * @param balance The initial balance.
     */
    public BankAccount(double balance) {
        this.balance = balance;
    }
    /**
     * Returns the current balance of the account.
     * @return The account balance.
     */
    public double getBalance() {
        return balance;
    }
    /**
     * Withdraws an amount from the balance if sufficient funds are available.
     * @param amount The amount to withdraw.
     * @throws IllegalArgumentException If insufficient funds.
     */
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Недостаточно средств на счете.");
        }
    }
}

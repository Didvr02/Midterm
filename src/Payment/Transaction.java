package Payment;

/**
 * Transaction class stores transaction information.
 */
public class Transaction {
    private String transactionId;
    private double amount;
    private TransactionStatus status;
    private String details;

    /**
     * Constructor to create a transaction.
     * @param transactionId The transaction ID.
     * @param amount The transaction amount.
     * @param status The transaction status.
     * @param details The transaction details.
     */
    public Transaction(String transactionId, double amount, TransactionStatus status, String details) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.status = status;
        this.details = details;
    }

    /**
     * Returns the transaction ID.
     * @return The transaction ID.
     */
    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "Payment.Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", amount=" + amount +
                ", status=" + status +
                ", details='" + details + '\'' +
                '}';
    }
}
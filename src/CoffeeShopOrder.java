/**
 * CoffeeShopOrder class combines coffee ordering and payment functionality.
 * Uses the Factory Method and Decorator patterns.
 * Manages transactions and orders.
 */
import Coffe.Coffee;
import Decorator.CaramelDecorator;
import Decorator.ChocolateDecorator;
import Decorator.MilkDecorator;
import Factory.CoffeeFactory;
import Factory.CreditCardPaymentFactory;
import Payment.*;
import Factory.PayPalPaymentFactory;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeShopOrder {
    private Coffee coffee;
    private PaymentMethod paymentMethod;
    private List<Transaction> transactionHistory = new ArrayList<>();

    /**
     * Creates a coffee of the specified type using CoffeeFactory.
     * @param type The coffee type (espresso, cappuccino, latte).
     */
    public void createCoffee(String type) {
        coffee = new CoffeeFactory().createCoffee(type);
    }

    /**
     * Adds a decorator to the current coffee.
     * @param decoratorType The decorator type (milk, chocolate, caramel).
     */
    public void addDecorator(String decoratorType) {
        if (coffee == null) {
            System.out.println("Please select a coffee first.");
            return;
        }

        switch (decoratorType.toLowerCase()) {
            case "milk":
                coffee = new MilkDecorator(coffee);
                break;
            case "chocolate":
                coffee = new ChocolateDecorator(coffee);
                break;
            case "caramel":
                coffee = new CaramelDecorator(coffee);
                break;
            default:
                System.out.println("Unknown decorator.");
        }
    }

    /**
     * Selects a payment method.
     * @param paymentMethod The PaymentMethod object.
     */
    public void selectPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Processes the payment and returns the transaction.
     * @param details The payment details.
     * @return The transaction or null if the order is not complete.
     */
    public Transaction processPayment(PaymentDetails details) {
        if (coffee == null || paymentMethod == null) {
            System.out.println("Please select a coffee and payment method first.");
            return null;
        }

        double amount = coffee.getCost();
        Transaction transaction = paymentMethod.processPayment(amount, details);
        transactionHistory.add(transaction);
        return transaction;
    }

    /**
     * Displays the current order information.
     */
    public void displayOrder() {
        if (coffee == null) {
            System.out.println("Order is empty.");
            return;
        }

        System.out.println("Order: " + coffee.getDescription());
        System.out.println("Cost: $" + coffee.getCost());
    }

    /**
     * Returns the transaction history.
     * @return The list of transactions.
     */
    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    public static void main(String[] args) {
        CoffeeShopOrder order = new CoffeeShopOrder();
        Scanner scanner = new Scanner(System.in);

        // Create a bank account with an initial balance
        BankAccount bankAccount = new BankAccount(500.0);

        while (true) {
            System.out.println("\nSelect an action:");
            System.out.println("1. Select coffee");
            System.out.println("2. Add decorator");
            System.out.println("3. Select payment method");
            System.out.println("4. Place order");
            System.out.println("5. Show transaction history");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Select coffee (espresso, cappuccino, latte):");
                    String coffeeType = scanner.nextLine();
                    order.createCoffee(coffeeType);
                    break;
                case 2:
                    System.out.println("Select decorator (milk, chocolate, caramel):");
                    String decoratorType = scanner.nextLine();
                    order.addDecorator(decoratorType);
                    break;
                case 3:
                    System.out.println("Выберите метод оплаты (creditcard, paypal, crypto, adapter):");
                    String paymentType = scanner.nextLine();
                    switch (paymentType.toLowerCase()) {
                        case "creditcard":
                            order.selectPaymentMethod(new CreditCardPaymentFactory(bankAccount).createPaymentMethod());
                            break;
                        case "paypal":
                            order.selectPaymentMethod(new PayPalPaymentFactory().createPaymentMethod());
                            break;
                        case "adapter":
                            order.selectPaymentMethod(new PaymentAdapter(new ExternalPaymentService()));
                            break;
                        default:
                            System.out.println("Неизвестный метод оплаты.");
                    }
                    break;
                case 4:
                    order.displayOrder();
                    System.out.println("Введите платежные данные:");
                    String paymentDetails = scanner.nextLine();
                    Transaction transaction = order.processPayment(new PaymentDetails(paymentDetails));
                    if (transaction != null) {
                        System.out.println("Транзакция: " + transaction);
                        if (transaction.getStatus() == TransactionStatus.COMPLETED && order.paymentMethod instanceof CreditCardPayment) {
                            System.out.println("Остаток на счете: $" + ((CreditCardPayment) order.paymentMethod).getBalance());
                        }
                    }
                    break;
                case 5:
                    order.getTransactionHistory().forEach(System.out::println);
                    break;
                case 0:
                    System.out.println("Выход.");
                    return;
                default:
                    System.out.println("Неверный выбор.");
            }
        }
    }
}
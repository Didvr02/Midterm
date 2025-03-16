# Coffee Shop with Integrated Payment System

This project simulates a coffee shop with an integrated payment system, demonstrating the use of several design patterns.

## Features

* **Coffee Ordering:** Users can select different types of coffee (Espresso, Cappuccino, Latte) and add various decorators (Milk, Chocolate, Caramel).
* **Payment System:** Supports multiple payment methods (Credit Card, PayPal, Crypto, Adapter) with transaction processing and history.
* **Credit Card Payments:** Includes a simulated bank account with balance checks and withdrawals.
* **Transaction History:** Displays a history of all payment transactions.
* **Balance Display:** Displays the remaining balance after a credit card payment.

## Design Patterns Used

* **Factory Method:** Used to create Coffee objects and PaymentMethod objects.
* **Decorator:** Used to add decorators to Coffee objects.
* **Adapter:** Used to integrate an external payment service.

## Architecture

The system consists of the following components:

* **Coffee:**
    * `Coffee` interface and concrete coffee classes (`Espresso`, `Cappuccino`, `Latte`).
    * `CoffeeFactory` class to create coffee objects.
    * `CoffeeDecorator` abstract class and concrete decorators (`MilkDecorator`, `ChocolateDecorator`, `CaramelDecorator`).
* **Payment System:**
    * `PaymentMethod` interface and concrete payment classes (`CreditCardPayment`, `PayPalPayment`,).
    * `PaymentDetails` class to store payment details.
    * `Transaction` class to store transaction information.
    * `TransactionStatus` enum to define transaction statuses.
    * `PaymentFactory` interface and concrete factories (`CreditCardPaymentFactory`, `PayPalPaymentFactory`, `CryptoPaymentFactory`).
    * `PaymentAdapter` to adapt an external payment service.
    * `ExternalPaymentService` as a mock external service.
* **BankAccount:**
    * `BankAccount` class to simulate a bank account with balance.
* **CoffeeShopOrder:**
    * `CoffeeShopOrder` class to manage coffee orders and payments.


## Example Usage

1.  Select a coffee type.
2.  Add decorators.
3.  Choose a payment method.
4.  Enter payment details.
5.  View the transaction history.
6.  Check the remaining balance (for credit card payments).

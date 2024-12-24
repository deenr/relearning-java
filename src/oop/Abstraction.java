package oop;

public class Abstraction {
    public static void main(String[] args) {
        CreditCardPaymentMethod creditCard = new CreditCardPaymentMethod();
        creditCard.processPayment();
        creditCard.printReceipt();


        PayPalPaymentMethod paypal = new PayPalPaymentMethod();
        paypal.processPayment();
        paypal.printReceipt();
    }
}

abstract class PaymentMethod {
    abstract void processPayment();

    void printReceipt() {
        System.out.println("The receipt is being printed.");
    }
}

class CreditCardPaymentMethod extends PaymentMethod {
    @Override
    void processPayment() {
        System.out.println("Processing the credit card peyment.");
    }
}

class PayPalPaymentMethod extends PaymentMethod {
    @Override
    void processPayment() {
        System.out.println("Processing the PayPal peyment.");
    }
}
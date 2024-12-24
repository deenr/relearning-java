# Polymorphism
- The ability for an object to identify as more than one type
  - Can be done through a common interface or abstract class.
- Polymorphism can be achieved through 
  - Method overloading => compile time polymorphism
  - Method overriding => runtime polymorphism

## Polymorphism in Action
- Polymorphism allows methods to work with objects of different types without knowing the specific type of object at compile time.
- The actual method that gets called is determined at runtime, based on the object type.

```java
// Abstract class (Contract)
abstract class PaymentMethod {
    public abstract void processPayment(double amount);
}

// Concrete class implementing the contract
class PayPalPayment extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " via PayPal.");
    }
}

class CreditCardPayment extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " via Credit Card.");
    }
}

// Payment Processor using Polymorphism
class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.processPayment(amount);
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        // Using PayPal payment method
        PaymentMethod paypal = new PayPalPayment();
        processor.processPayment(paypal, 100);  // Outputs: Processing payment of $100.0 via PayPal.

        // Using Credit Card payment method
        PaymentMethod creditCard = new CreditCardPayment();
        processor.processPayment(creditCard, 200);  // Outputs: Processing payment of $200.0 via Credit Card.
    }
}
```

## Benefits of Using Polymorphism
- Flexibility, maintainability and extensibility
   - Because polymorphism allows a method to work with different subclasses that behave differently depending on the object passed to it. This way new subclasses can be added without having to change the exisiting code.

## When to Use Polymorphism
- Use polymorphism when you need to work with objects that are seen as the same type, but each one contains a slightly different functionality.
- Useful when you want to create a framework or structure that can work with various objects that share common behavior but have specific implementations.

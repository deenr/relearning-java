# Interfaces
- An interface defines a contract that a class must adhere to.
- It can contain `abstract` methods (without a body) and `default` methods (with a body).
- A class can implement multiple interfaces, unlike inheritance, which allows a class to inherit from only one superclass.

## Implementing an Interface
- A class implements an interface by providing concrete implementations for the methods declared in the interface.
- Use the `implements` keyword in the class declaration.

```java
// Interface definition
interface Animal {
    void sound();  // Abstract method (no body)
    void move();   // Abstract method (no body)
}

// Class that implements the interface
class Lion implements Animal {
    @Override
    public void sound() {
        System.out.println("Roar");
    }

    @Override
    public void move() {
        System.out.println("The lion moves swiftly.");
    }
}

class Rat implements Animal {
    @Override
    public void sound() {
        System.out.println("Squeak");
    }

    @Override
    public void move() {
        System.out.println("The rat scurries around.");
    }
}

// Testing Interfaces
public class Main {
    public static void main(String[] args) {
        // Create Lion instance
        Animal lion = new Lion();
        lion.sound();  // Outputs: Roar
        lion.move();   // Outputs: The lion moves swiftly.

        // Create Rat instance
        Animal rat = new Rat();
        rat.sound();   // Outputs: Squeak
        rat.move();    // Outputs: The rat scurries around.
    }
}
```

## Default Methods in Interfaces
- Interfaces can have default methods with a body. This allows you to add new methods to an interface without breaking existing classes that implement the interface.
- Default methods are implemented with the `default` keyword.

```java
// Interface with a default method
interface Animal {
    void sound();
    void move();

    default void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

// Class that implements the interface
class Lion implements Animal {
    @Override
    public void sound() {
        System.out.println("Roar");
    }

    @Override
    public void move() {
        System.out.println("The lion moves swiftly.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion();
        lion.sound();  // Outputs: Roar
        lion.move();   // Outputs: The lion moves swiftly.
        lion.sleep();  // Outputs: The animal is sleeping. (default method)
    }
}
```

## Multiple Interfaces Implementation
- A class can implement more than one interface, allowing it to inherit behavior from multiple sources.
- This is useful for adding functionality from different areas without using multiple inheritance.

```java
interface Hunter {
    void hunt();
}

interface Swimmer {
    void swim();
}

class Crocodile implements Hunter, Swimmer {
    @Override
    public void hunt() {
        System.out.println("The crocodile hunts.");
    }

    @Override
    public void swim() {
        System.out.println("The crocodile swims.");
    }
}

public class Main {
    public static void main(String[] args) {
        Crocodile croc = new Crocodile();
        croc.hunt();  // Outputs: The crocodile hunts.
        croc.swim();  // Outputs: The crocodile swims.
    }
}
```

## Benefits of Using Interfaces
- Multiple Implementations: A class can implement multiple interfaces, enabling it to inherit behavior from multiple sources.
- Loose Coupling: Interfaces decouple the class from the specific implementation, promoting flexibility and maintainability.
- Contractual Obligations: An interface defines a contract, ensuring that any class that implements the interface will adhere to the same method signatures.

## When to Use an Interface
- Use an interface when you want to define a common behavior (method signatures) that can be implemented by unrelated classes.
- If you need to allow a class to implement multiple types or behaviors, interfaces are a good choice.
# Inheritance
- It allows a class to acquire properties and methods from another class (called parent or super class)
- It promotes code reuse and establishes a parent-child relationship between classes
- It can be used by adding the `extend` keyword to a class

## Super/parent class vs sub/child class
- Superclass contain the variables and methods that will be inherited
- Subclass inherits these members from the super class
- However subclasses can override the parents methods

```java
// Parent class (Superclass)
class Vehicle {
    int wheels;
    int speed;

    public void move() {
        System.out.println("The vehicle is moving.");
    }
}

// Child class (Subclass)
class Car extends Vehicle {
    int doors;

    public void startEngine() {
        System.out.println("Engine started. Vroom Vroom!");
    }
}

class Bicycle extends Vehicle {
    int pedals;

    public void ringBell() {
        System.out.println("Ring ring!");
    }
}

// Testing Inheritance
public class Main {
    public static void main(String[] args) {
        // Create a Car instance
        Car myCar = new Car();
        myCar.wheels = 4;
        myCar.move(); // Inherited method
        myCar.startEngine(); // Unique to Car

        // Create a Bicycle instance
        Bicycle myBike = new Bicycle();
        myBike.wheels = 2;
        myBike.move(); // Inherited method
        myBike.ringBell(); // Unique to Bicycle
    }
}
```
## Overriding Methods
- The `@Override` annotation ensures that the method signature matches the superclass.
- Overriding allows us to provide a custom implementation for an inherited method.

```java
class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("The car is moving.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.move(); // Outputs: The car is moving.
    }
}
```

## Private Memberss
- Private fields/methods of a superclass are not accessible in the subclass.
- Use `protected` or `public` to allow access in child classes.
- Side note: <em>Protected members can be accessed within the same package, and by subclasses.</em>

```java
class Vehicle {
    private int speed; // Not accessible in subclass
    protected int wheels; // Accessible in subclass
}

class Car extends Vehicle {
    public void displayWheels() {
        System.out.println("Wheels: " + wheels); // Accessible
    }
}
```
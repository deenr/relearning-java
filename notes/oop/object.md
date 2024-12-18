# What is an object?

- An object is an instance of a class that encapsulates attributes (data) and methods (behavior).
- Objects allow you to model real-world entities in code.

```java
class Car {
    String brand = "Opel"
    String type = "Sedan";
    int fuelCapacityInLiter = 60;

    public void drive() {
        System.out.println("The car is now going forward.");
    }

    public void brake() {
        System.out.println("The car is now stopped.");
    }
}
```

## Constructor
- A constructor is a special method used to initialize objects.
- It has the same name as the class and no return type.
- Use the `this` keyword to differentiate between class attributes and parameters.

```java
class Human {
    private String name;
    private int age;
    private double weight;
    
    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", " + age + " years old.");
    }
}
```
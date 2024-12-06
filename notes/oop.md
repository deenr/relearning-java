# Object oriented programming

## What is an object?

- An object is an instance of a class that may contain attributes or methods

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
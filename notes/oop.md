# Object oriented programming

## What is an object?

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

### Constructor
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

### Overloaded constructors
- Multiple constructors within a class with the same name but with different parameters
- Name + Parameters = Unique constructor signature

```java
class Pizza {
    private int diameter;
    private String[] ingredients;
    private String dough;
    
    Pizza(int diameter, String[] ingredients, String dough,) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}
```

### toString() method 
- Special (standard) method that all object inherit
- It returns a string that textually represents an object
- Can be implicit `System.out.println(pizza)` or explicit `System.out.println(pizza.toString())`
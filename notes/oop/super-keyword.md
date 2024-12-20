# Super keyword
- Is the keyword used to access the superclass from a subclass.
- It allows access to the parents methods, variables and contructors

## When parent variables are shadow by the child class
- If a child class defines a variable with the same name as the parent class, the child’s variable shadows the parent’s variable.
- Use `super` to explicitly access the parent class variable.

```java
class Parent {
    String message = "Parent message";
}

class Child extends Parent {
    String message = "Child message";

    void displayMessages() {
        System.out.println("Child variable: " + message);
        System.out.println("Parent variable: " + super.message); // Access parent variable
    }
}
```

## Calling parent class methods.
- The `super` keyword can be used to call methods from the parent class that are overridden in the child class.
- This ensures that the original functionality from the parent class is still executed.

```java
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        super.makeSound(); // Call parent method
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}
```

## Calling parent class constructors using `super()`.
- The `super()` keyword is used to call the parent class constructor.
- `super()` must be the first line in the child class constructor.
  - If not, it results in a compile-time error. Because the parent class must be initialized first to ensure its properties and methods are set up before the child class constructor runs.

```java
class Animal {
    Animal() {
        System.out.println("Animal constructor is called");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // Calls parent constructor
        System.out.println("Dog constructor is called");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
    }
}
```
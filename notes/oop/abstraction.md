# Abstraction
- An abstract class serves as blueprints for other classes
- An abstract class cannot be instantiated
- An abstract class can include: 
  - Abstract methods (methods without a body)
  - Concrete methods (methods with implementation)

```java
abstract class Shape {
    abstract void draw(); // Abstract method

    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
    }
}
```

## Key Points
- Abstract classes provide a structure for subclasses to follow.
- **Concrete subclasses** must implement all abstract methods.
- **Abstract subclasses** can skip implementation but cannot be instantiated.
- Use abstract classes when you want to enforce a contract for subclasses while providing shared functionality.

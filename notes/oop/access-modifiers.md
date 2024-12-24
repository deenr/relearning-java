# Access Modifiers

## Overview
| Modifier    | Class | Package | Subclass (Same Package)  | Subclass (Different Package)  | World |
|-------------|-------|---------|--------------------------|-------------------------------|-------|
| `public`    | ✔     | ✔       | ✔                        | ✔                             | ✔     |
| `protected` | ✔     | ✔       | ✔                        | ✔                             |       |
| `default`   | ✔     | ✔       | ✔                        |                               |       |
| `private`   | ✔     |         |                          |                               |       |

## Public
- Methods and variables declared as `public` are accessible from anywhere in the application.

### Example:
```java
public class PublicExample {
    public void display() {
        System.out.println("Public method");
    }
}

class Main {
    public static void main(String[] args) {
        PublicExample obj = new PublicExample();
        obj.display(); // Accessible from any class
    }
}
```

## Protected
- Members declared as `protected` are accessible:
  - Within the same package.
  - In subclasses, even if the subclass is in a different package.

### Example:
```java
package parent;

public class Parent {
    protected void show() {
        System.out.println("Protected method");
    }
}
```
```java
package child;

import parent.Parent;

public class Child extends Parent {
    public void display() {
        show(); // Accessible because Child extends Parent
    }
}
```

## Default (Package-Private)
- If no access modifier is specified, the member is default (also called package-private).
- Accessible only within the same package.

### Example:
```java
class DefaultExample {
    void display() {
        System.out.println("Default method");
    }
}

class Main {
    public static void main(String[] args) {
        DefaultExample obj = new DefaultExample();
        obj.display(); // Accessible because both classes are in the same package
    }
}
```

## Private
- Members declared as `private` are accessible only within the same class.

### Example:
```java
class PrivateExample {
    private void display() {
        System.out.println("Private method");
    }

    public void accessDisplay() {
        display(); // Accessible within the same class
    }
}

class Main {
    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();
        // obj.display(); // Compile-time error: display() has private access
        obj.accessDisplay(); // Indirectly accessing the private method
    }
}
```

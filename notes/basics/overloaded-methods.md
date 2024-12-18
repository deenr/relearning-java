# **Overloaded Methods**

### **What Are Overloaded Methods?**
- **Overloading** allows multiple methods in the same class to share the same name but differ in:
  - Number of parameters.
  - Type of parameters.
  - Order of parameters.
- It enhances code readability and flexibility by providing variations of the same method for different inputs.

---

### **Rules for Method Overloading**
1. **Method Name**: Must be the same.
2. **Parameter List**: Must be different (by type, number, or order).
3. **Return Type**: Does NOT differentiate overloaded methods. 
   - Example: You **cannot** have two methods differing only in their return type.

---

### **Examples**

#### **Overloading Based on Number of Parameters**
```java
public class Calculator {
    // Method with two parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method with three parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3)); // Output: 5
        System.out.println(calc.add(2, 3, 4)); // Output: 9
    }
}
```

#### **Overloading Based on Type of Parameters**
```java
public class Printer {
    public void print(int num) {
        System.out.println("Printing integer: " + num);
    }

    public void print(String text) {
        System.out.println("Printing string: " + text);
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print(42);       // Output: Printing integer: 42
        printer.print("Hello");  // Output: Printing string: Hello
    }
}
```

#### **Overloading Based on Order of Parameters**
```java
public class Greetings {
    public void greet(String name, int age) {
        System.out.println("Hello " + name + ", age: " + age);
    }

    public void greet(int age, String name) {
        System.out.println("Hello " + name + ", age: " + age);
    }

    public static void main(String[] args) {
        Greetings greet = new Greetings();
        greet.greet("Dean", 30); // Output: Hello Dean, age: 30
        greet.greet(30, "Dean"); // Output: Hello Dean, age: 30
    }
}
```

---

### **Why Use Method Overloading?**
- **Convenience**: Use the same method name for related operations.
- **Readability**: Reduces the need for creating multiple differently named methods.
- **Flexibility**: Handle various input types and scenarios with ease.

---

### **Overloading and Constructors**
- Constructors can also be overloaded to allow different ways of initializing an object.

```java
public class Person {
    String name;
    int age;

    // No-argument constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor with one parameter
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    // Constructor with two parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Dean");
        Person p3 = new Person("Dean", 30);

        p1.displayInfo(); // Output: Name: Unknown, Age: 0
        p2.displayInfo(); // Output: Name: Dean, Age: 0
        p3.displayInfo(); // Output: Name: Dean, Age: 30
    }
}
```
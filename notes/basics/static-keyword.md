# Static keyword modifier
- The `static` keyword makes methods, variables or blocks belong to the class itself, instead of the created object.
- These `static` members are shared across all the instances of the class.

## Static variables
- Static variables are class-level variables.
- Only one copy of a static variable exists, shared by all instances of the class.

```java
class Student {
    static int totalStudents = 0; // Static variable

    Student() {
        totalStudents++;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println("Total Students: " + Student.totalStudents);
    }
}
```

## Static methods
- Static methods belong to the class itself, meaning they can be called without having to create an instance of the class
- They cannot access instance variables or instance methods directly.

```java
class MathUtils {
    static int add(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        int sum = MathUtils.add(5, 3); // No object needed
        System.out.println("Sum: " + sum);
    }
}
```

## Static Blocks
- Are used to initialise static variables
- These blocks run only once when the class is loaded into memory
- ≈ Constructors for Static Variables

```java
class Config {
    static String configValue;

    static {
        configValue = "Loaded at class initialization";
        System.out.println("Static block executed!");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Config Value: " + Config.configValue);
    }
}
```
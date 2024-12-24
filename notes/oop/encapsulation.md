# Encapsulation
- It is a concept where the data (fields) and methods (functions) are bundled together in a class.
- It restricts direct access to some of the object's variables.
- It is achieved by making fields `private` and providing public methods (getters and setters) to access and modify those fields.

## Private Members and Getters/Setters
- Private variables can only be accessed within the class.
- Public getter and setter methods are provided to access and modify private fields.

```java
// Class with encapsulation
public class Employee {
    // Private fields
    private String name;
    private int age;
    private double salary;

    // Constructor to initialize fields
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter method for salary
    public double getSalary() {
        return salary;
    }

    // Setter method for salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive.");
        }
    }
}
```

## Benefits of Encapsulation
- **Control over data**: Getters and setters allow controlling how data is accessed and modified.
- **Improved security**: Internal data is hidden and can only be modified through methods with additional logic.
- **Flexibility**: Changes to the internal implementation of the class can be made without affecting external code that interacts with it.
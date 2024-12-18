# **Wrapper Classes**

### **What Are Wrapper Classes?**
- Wrapper classes provide an object representation for primitive data types.
- Useful in cases where objects are required instead of primitives (e.g., in collections like `ArrayList`).

| **Primitive Type** | **Wrapper Class** |
|---------------------|-------------------|
| `int`              | `Integer`         |
| `double`           | `Double`          |
| `boolean`          | `Boolean`         |
| `char`             | `Character`       |
| `float`            | `Float`           |
| `long`             | `Long`            |
| `byte`             | `Byte`            |
| `short`            | `Short`           |

### **Common Methods in Wrapper Classes**

| **Method**               | **Description**                               | **Example**                              |
|--------------------------|-----------------------------------------------|------------------------------------------|
| `parseInt(String)`       | Converts a `String` to an `int`.              | `Integer.parseInt("123") // 123`         |
| `valueOf(String)`        | Converts a `String` to a wrapper object.      | `Double.valueOf("3.14") // 3.14`         |
| `toString()`             | Converts a value to a `String`.               | `Integer.toString(123) // "123"`         |
| `intValue()`             | Returns the primitive value of the object.    | `Integer.valueOf(123).intValue() // 123` |

---

### **Autoboxing and Unboxing**
- **Autoboxing**: Automatic conversion that the Java compiler makes between a primitive to its wrapper type.
  ```java
  Integer num = 10; // Primitive '10' is converted to an Integer object.
  ```
- **Unboxing**: Automatic conversion from a wrapper type to its primitive.
  ```java
  int num = new Integer(10); // Integer object is converted to primitive '10'.
  ```

---

### **Example: Using Wrapper Classes**

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(); // Requires wrapper class
        numbers.add(10); // Autoboxing
        numbers.add(20);

        int sum = 0;
        for (Integer num : numbers) {
            sum += num; // Unboxing
        }

        System.out.println("Sum: " + sum); // Output: Sum: 30
    }
}
```

---

### **When to Use Wrapper Classes?**
- When working with collections like `ArrayList`, `HashMap`, etc., which require objects.
- For utility methods in wrapper classes like `Integer.parseInt()`.
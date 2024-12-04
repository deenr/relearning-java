# Scanner in Java

The `Scanner` class is used to take input from the user. It is part of the `java.util` package. Below are the most commonly used methods:

## Commonly Used Methods
- **`nextLine()`**: Reads a full line of input (including spaces).
- **`next()`**: Reads a single word (up to the first space or newline).
- **`nextInt()`**: Reads an integer.
- **`nextDouble()`**: Reads a decimal number (double).

## Important Note
If you use `nextInt()` (or similar methods like `nextDouble()`) and then call `nextLine()`, the leftover newline character in the input buffer causes `nextLine()` to return an empty string.  
**Solution**: Add an extra `nextLine()` after `nextInt()` to clear the input buffer.

### Example
```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Clear input buffer
        scanner.nextLine();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("You entered: " + number + " and " + name);

        scanner.close();
    }
}

/**
 *
 * @author reymen
 */
public class Expressions {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Basic arithmetic operations
        int sum = a + b;
        System.err.println("The sum from " + a + " and " + b + " is " + sum);
        int difference = a - b;
        System.err.println("The difference from " + a + " and " + b + " is " + difference);
        int product = a * b;
        System.err.println("The product from " + a + " and " + b + " is " + product);
        int quotient = a / b;
        System.err.println("The quotient from " + a + " and " + b + " is " + quotient);
        int remainder = a % b;
        System.err.println("The remainder from " + a + " and " + b + " is " + remainder);

        // Increment and decrement
        a++;
        System.err.println("When we increment a, we get " + a);
        b--;
        System.err.println("When we decrement b, we get " + b);

        // Compound assignment
        a += 5;
        System.err.println("When we add 5 to a. we get " + a);
        
        b *= 3;
        System.err.println("When we multiply b by 5. we get " + b);

    }
}

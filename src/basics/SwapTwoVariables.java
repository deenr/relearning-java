/**
 *
 * @author reymen
 */
public class SwapTwoVariables {
    public static void main(String[] args) {
        String valueA = "Hello";
        String valueB = "World";

        System.out.println(valueA + " " + valueB); // Should output "Hello World"
        
        String temp;
        temp = valueA;
        valueA = valueB;
        valueB = temp;
        
        System.out.println(valueA + " " + valueB); // Should output "World Hello"
    }
}

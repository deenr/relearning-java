import java.util.Scanner;

/**
 *
 * @author reymen
 */
public class UserInputScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        
        String name = scanner.nextLine();
        
        System.out.println("Hello " + name + ", how old are you?");
        
        int age = scanner.nextInt(); // only reads the numbers which means when typing 18 and pressing enter we go from 18\n => \n (because nextInt takes 18) , meaning \n is left
        scanner.nextLine(); // Needed because nextInt didnt remove \n and this way we can clear the input/prepare the scanner for the next line

        System.out.println("You are " + age + " years old? What food do you like?");
        
        String food = scanner.nextLine();
        
        System.out.println("Cool, I know someone that likes " + food.toLowerCase() + " too.");
        scanner.close();
    }
}

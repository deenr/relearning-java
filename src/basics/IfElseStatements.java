import java.util.Random;


/**
 *
 * @author reymen
 */
public class IfElseStatements {
    public static void main(String[] args) {
        Random random = new Random();

        int range = 10;
        int start = 1;

        int randomNumber = random.nextInt(range) + start;

        if (randomNumber < 3) {
            System.out.println("The number is smaller than 3");
        } else if (randomNumber < 5) {
            System.out.println("The number is smaller than 5");
        } else {
            System.out.println("Nothing special about the number");
        }

        System.out.println("The number was " + randomNumber);
    }
}

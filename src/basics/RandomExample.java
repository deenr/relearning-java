import java.util.Random;

/**
 *
 * @author reymen
 */
public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();

        int range = 10;
        int start = 1;

        int randomNumber = random.nextInt(range) + start;

        System.err.println("A random number between " + start + " and " + range + " is " + randomNumber);

        double number = random.nextDouble();
        System.err.println(number);

        boolean booleanValue = random.nextBoolean();
        System.err.println(booleanValue);
    }
}

import java.util.Random;

/**
 *
 * @author reymen
 */
public class WhileLoop {
    public static void main(String[] args) {
        Random random = new Random();

        int range = 10;
        int start = 1;
        
        int number = random.nextInt(range) + start;

        int iterations = 0;

        while (number != 10) { 
            System.out.println("The number is not equal to 10, the current number is " + number);

            number = random.nextInt(range) + start;
            iterations++;
        }

        System.out.println("After " + iterations + " iterations, the number is finally " + number);
    }
}

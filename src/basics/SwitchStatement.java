import java.util.Random;

/**
 *
 * @author reymen
 */
public class SwitchStatement {
    public static void main(String[] args) {
        Random random = new Random();

        int randomDay = random.nextInt(10) + 1;

        System.out.println("The number of the day is " + randomDay);

        switch (randomDay) {
            case 1:
                System.out.println("The day is a Monday");
                break;
            case 2:
                System.out.println("The day is a Tuesday");
                break;
            case 3:
                System.out.println("The day is a Wednesday");
                break;
            case 4:
                System.out.println("The day is a Thursday");
                break;
            case 5:
                System.out.println("The day is a Friday");
                break;
            case 6:
                System.out.println("The day is a Saturday");
                break;
            case 7:
                System.out.println("The day is a Sunday");
                break;
            default:
                System.out.println("The day is invalid");
                break;
        }
    }
}

/**
 *
 * @author reymen
 */
public class LogicalOperators {
    public static void main(String[] args) {
        int value = 12;
        String dayOfTheWeek = "Tuesday";

        if (value < 3 || dayOfTheWeek.equals("Monday")) {
            System.out.println("The value is less than 3 and its Monday");
        } else if (value >= 3 && dayOfTheWeek.equals("Tuesday")) {
            System.out.println("The value is greater or equal than 3 and its Tuesday");
        } else {
            System.out.println("Nothing special");
        }
    }
}

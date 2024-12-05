
import java.util.ArrayList;

/**
 *
 * @author reymen
 */
public class ForEachLoop {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Dean");
        names.add("Peter");
        names.add("John");
        names.add("Jeffrey");

        System.out.println("The names in the list include:");
        
        for (String name: names) {
            System.out.println(name);
        }
    }
}

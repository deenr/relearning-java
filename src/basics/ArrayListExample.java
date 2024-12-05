
import java.util.ArrayList;

/**
 *
 * @author reymen
 */
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Dean");

        System.out.println(names); //[Dean]

        names.add("Peter");
        names.add("John");

        System.out.println(names); //[Dean, Peter, John]
        
        names.set(1, "Joe");

        System.out.println(names); //[Dean, Joe, John]
    }
}

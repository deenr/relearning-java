/**
 *
 * @author reymen
 */
public class ForLoop {
    public static void main(String[] args) {
        String[] names = new String[4];

        names[0] = "Dean";
        names[1] = "Peter";
        names[2] = "John";
        names[3] = "Jeffrey";

        System.out.println("The names in the list include:");
        
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}

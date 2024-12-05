
import java.util.ArrayList;

/**
 *
 * @author reymen
 */
public class TwoDeeArrayListExample {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();
        
        ArrayList<String> beverageList = new ArrayList<String>();
        beverageList.add("Beer");
        beverageList.add("Wine");
        beverageList.add("Cole");

        ArrayList<String> vegatableList = new ArrayList<String>();
        vegatableList.add("Potato");
        vegatableList.add("Tomato");
        vegatableList.add("Pickles");

        groceryList.add(beverageList);
        groceryList.add(vegatableList);

        System.out.println(groceryList); // [[Beer, Wine, Cole], [Potato, Tomato, Pickles]]
    }
}

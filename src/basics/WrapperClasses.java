/**
 *
 * @author reymen
 */
public class WrapperClasses {
    public static void main(String[] args) {
        // autoboxing 
        // automatically turns a primitive data type into a wrapper class
        Boolean a = true;
        String b = "1234";
        Character c = 't';
        Integer d = 1;
        Double f = 0.125;

        // unboxing
        // automatically turns a Interger (wrapper class) into an int (primitive type)
        int e = d; 

        // Methods
        System.out.println(a.toString()); // "true"
        System.out.println(Integer.parseInt(b)); // 123
    }
}

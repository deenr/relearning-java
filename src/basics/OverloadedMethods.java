/**
 *
 * @author reymen
 */
public class OverloadedMethods {
    public static void main(String[] args) {
        System.out.println(add(1,2)); // 3
        
        System.out.println(add(1,2, 3)); // 6

        System.out.println(add(1,"2")); // 3

        System.out.println(add(1,"2")); // 3
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static int add(int a, String b) {
        return a + Integer.valueOf(b);
    }

    public static int add(Integer a, String b) {
        return a + Integer.valueOf(b);
    }
}

package oop;

/**
 *
 * @author reymen
 */
public class Objects {
    public static void main(String[] args) {
        CoffeeCup coffee = new CoffeeCup();

        coffee.fill();
        coffee.spill();

        System.out.println("The coffee cup is " + coffee.size.toLowerCase() + " size.");
    }
}

class CoffeeCup {
    String size = "Medium";

    public void spill() {
        System.out.println("The coffee has been spilled");
    }

    public void fill() {
        System.out.println("The coffee is now full.");
    }
}

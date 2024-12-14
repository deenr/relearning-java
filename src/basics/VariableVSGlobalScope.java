package basics;

import java.util.Random;

public class VariableVSGlobalScope {
    public static void main(String[] args) {
        DiceRoller diceRoller = new DiceRoller();
        
    }
}

class DiceRoller {
    Random random = new Random(); // global variable
    int number = 0; // global variable
    
    DiceRoller() {
        // Random random = new Random(); // local variable
        // int number = 0; // local variable
        // roll(random, number); // with local variables

        roll(); // with global variables
    }

    // with local variables
    // void roll(Random random, int number) {
    //     number = random.nextInt(6) + 1;

    //     System.out.println(number);
    // }

    // with global variables
    void roll() {
        number = random.nextInt(6) + 1;

        System.out.println(number);
    }
}
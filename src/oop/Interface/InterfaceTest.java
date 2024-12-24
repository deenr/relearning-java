package oop.Interface;

public class InterfaceTest {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.hello();
        lion.hunt();

        Goat goat = new Goat();
        goat.flee();

        Fish fish = new Fish();
        fish.hunt();
        fish.flee();
    }
}

class Lion implements Predator {
    @Override
    public void hunt() {
        System.out.println("**The lion is hunting**");
    }
}

class Goat implements Prey {
    @Override
    public void flee() {
        System.out.println("**The goat is fleeing the scene**");
    }
}

class Fish implements Predator, Prey {
    @Override
    public void flee() {
        System.out.println("**The fish is fleeing a bigger fish**");
    }

    @Override
    public void hunt() {
        System.out.println("**The fish is hunting a smaller fish**");
    }

}
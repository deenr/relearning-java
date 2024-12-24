package oop.Interface;

public interface Predator {
    void hunt();
    default void hello() {
        System.out.println("The predator says \"Hi!\".");
    }
}

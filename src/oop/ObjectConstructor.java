/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package oop;

/**
 *
 * @author reymen
 */
public class ObjectConstructor {
    public static void main(String[] args) {
        Human human = new Human("Dean", 24, 76.2);
        Human human2 = new Human("John", 42, 102.6);

        human.introduce();
        human2.introduce();
    }
}

class Human {
    private String name;
    private int age;
    private double weight;
    
    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", " + age + " years old. And I weigh " + weight + "kg.");
    }
}
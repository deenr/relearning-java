package oop;

import java.util.ArrayList;

public class OverloadedConstructors {
    public static void main(String[] args) {
        ArrayList<String> ingredients = new ArrayList<String>();
        ingredients.add("Tomato");
        ingredients.add("Cheese");

        Pizza pizzaA = new Pizza(20, ingredients, "Cheese dough");
        pizzaA.bake();

        Pizza pizzaB = new Pizza(ingredients);
        pizzaB.bake();

        Pizza pizzaC = new Pizza();
        pizzaC.bake();
    }
}

class Pizza {
    private int diameter;
    private ArrayList<String> ingredients;
    private String dough;
    
    Pizza(int diameter, ArrayList<String> ingredients, String dough) {
        this.diameter = diameter;
        this.ingredients = ingredients;
        this.dough = dough;
    }

    Pizza(ArrayList<String> ingredients) {
        this.diameter = 35;
        this.ingredients = ingredients;
        this.dough = "Normal dough";
    }

    Pizza() {
        this.diameter = 35;
        ArrayList<String> ingredients = new ArrayList<String>();
        ingredients.add("Tomato");
        ingredients.add("Cheese");
        ingredients.add("Olive oil");
        this.ingredients = ingredients;
        this.dough = "Normal dough";
    }

    public void bake() {
        System.out.println("Pizza of " + diameter + "cm is being baked. The ingredients are " + ingredients.toString() + ", with " + dough.toLowerCase() + ".");
    }
}
package oop;

public class ObjectArray {
    public static void main(String[] args) {
        Food[] ingredients = new Food[3];

        ingredients[0] = new Food("Pasta");
        ingredients[1] = new Food("Tomato");
        ingredients[2] = new Food("Garlic");
        
        for (Food food : ingredients) {
            System.out.println(food.toString());
        }
    }
}

class Food {
    String name;

    Food(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
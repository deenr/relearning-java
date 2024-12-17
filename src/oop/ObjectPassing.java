package oop;

import java.util.ArrayList;

public class ObjectPassing {
    public static void main(String[] args) {
        Car bmw = new Car("BMW M3");
        Car mercedes = new Car("Mercedes-Benz CLA");
        
        Garage garage = new Garage();

        garage.park(bmw);
        garage.park(mercedes);

        System.out.println(garage.toString());
    }
}

class Car {
    String brand;

    Car(String brand) {
        this.brand = brand;
    }
}

class Garage {
    private ArrayList<Car> cars = new ArrayList<Car>();

    public void park(Car car) {
        cars.add(car);
    }

    @Override
    public String toString() {
        String carList = "";

        for (int i = 0; i < cars.size(); i++) {
            carList += cars.get(i).brand;
            
            if (i == cars.size() - 2) {
                carList += " and ";
            } else if (i != cars.size() - 1) {
                carList += ", ";
            }
        }

        return "Currently the garage contains the following cars: " + carList + ".";
    }
}

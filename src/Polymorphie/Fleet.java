package Polymorphie;

import java.util.ArrayList;

public class Fleet {

    private ArrayList<Car> cars = new ArrayList<Car>();

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public void print() {
        for(Car car : cars) {
            System.out.println(car.getModel() + ": " + car.getPrice());
        }
    }
}

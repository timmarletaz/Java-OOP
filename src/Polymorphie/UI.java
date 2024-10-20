package Polymorphie;

public class UI {
    public static void main(String[] args) {

        double price = 80000;

        System.out.println("Test 1");
        Car usedCar = new UsedCar("BMW M3 Competition", price, 90000);
        print("u90000", 44000, usedCar.getPrice());

        System.out.println("\nTest 2");
        Car crashedCar = new CrashedCar("Audi RS3", price, CrashedCar.DmgLow);
        print("Low", price*0.9, crashedCar.getPrice());

        System.out.println("\nTest 3");
        Fleet fleet = new Fleet();
        fleet.addCar(usedCar);
        fleet.addCar(crashedCar);
        fleet.print();
    }

    private static void print(String id, double expected, double effective) {
        System.out.println(id + " erwartet " + expected + ", bekommen: "+ effective);
    }

}

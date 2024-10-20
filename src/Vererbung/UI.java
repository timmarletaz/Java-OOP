package Vererbung;

public class UI {
    public static void main(String[] args) {

        UsedCar usedCar = new UsedCar("VW Passat", 45000, 135000);
        System.out.println("VW Passat" + " " + usedCar.getCarPrice());

        CrashedCar crashedCar = new CrashedCar("Dodge Challenger", 75000, CrashedCar.DmgMedium);
        System.out.println("\nDodge Challenger" + " " + crashedCar.getCarPrice());

        Car car = new Car("Renault Clio", 60000);
        System.out.println("\nRenault Clio" + " " + car.getCarPrice());

    }
}

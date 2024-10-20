package Polymorphie;

public class UsedCar extends Car{

    private int mileage;

    public UsedCar(String model, double price, int mileage) {
        super(model, price);
        this.mileage = mileage;
    }

    public double getPrice(){
        double kmPrice = (super.getPrice() / 100)  * 0.0005;
        double newPrice = super.getPrice() - (kmPrice * this.mileage);
        if(newPrice < 0){
            newPrice = 0;
        }
        return newPrice;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

}


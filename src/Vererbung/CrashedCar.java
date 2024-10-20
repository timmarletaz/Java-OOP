package Vererbung;

public class CrashedCar extends Car {

    private int damageLevel;
    public static final int DmgLow = 0;
    public static final int DmgMedium = 1;
    public static final int DmgTotal = 2;

    public CrashedCar(String model, double price, int damageLevel) {
        super(model, price);
        this.damageLevel = damageLevel;
    }

    public int getDamageLevel() {
        return damageLevel;
    }

    public void setDamageLevel(int damageLevel) {
        this.damageLevel = damageLevel;
    }

    public double getPrice(){
        double price = this.getCarPrice();
        switch (this.damageLevel){
            case DmgLow:
                price *= 0.9;
                break;
            case DmgMedium:
                price *= 0.5;
                break;
            case DmgTotal:
                price *= 0;
                break;
        }
        return price;
    }
}

package abstrakte_Klassen;

public class PrepaidCard extends Card{

    private double maxAmount;

    public PrepaidCard(double balance, int fee, String expirationDate, String owner, double maxAmount) {
        super(balance, fee, expirationDate, owner);
        if(balance > maxAmount){
            System.out.println("Maximaler Betrag für diese Karte beträgt: " + maxAmount);
            System.exit(0);
        }
        this.maxAmount = maxAmount;
    }

    public double getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(double maxAmount) {
        this.maxAmount = maxAmount;
    }

    @Override
    protected void spendMoney(double amount) {
        if(this.getBalance() - amount >= 0) {
            this.setBalance(this.getBalance() - amount);
        }else{
            System.out.println("Nicht genügend Guthaben");
        }
    }
}

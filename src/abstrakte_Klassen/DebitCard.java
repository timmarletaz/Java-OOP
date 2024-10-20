package abstrakte_Klassen;

import java.util.Date;

public class DebitCard extends Card {

    private double dailyLimit;

    public DebitCard(double balance, int fee, String expirationDate, String owner, double limit) {
        super(balance, fee, expirationDate, owner);
        this.dailyLimit = limit;
    }

    public double getDailyLimit() {
        return dailyLimit;
    }

    public void setDailyLimit(double dailyLimit) {
        this.dailyLimit = dailyLimit;
    }


    @Override
    protected void spendMoney(double amount) {
        if(amount < this.dailyLimit && this.getBalance() - amount >= 0) {
            this.setBalance(this.getBalance() - amount);
        }else{
            System.out.println("Saldo zu klein");
        }
    }

}

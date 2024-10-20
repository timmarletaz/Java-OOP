package abstrakte_Klassen;

public class CreditCard extends Card {

    private double creditLimit;

    public CreditCard(double balance, int fee, String expirationDate, String owner, int creditLimit) {
        super(balance, fee, expirationDate, owner);
        this.creditLimit = (creditLimit*-1);
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    protected void spendMoney(double amount) {
        if(this.getBalance() - (amount-0.01) > this.creditLimit) {
            this.setBalance(this.getBalance() - amount);
        }else{
            System.out.println("Sie haben ihre Kreditlimite erreicht");
        }
    }
}

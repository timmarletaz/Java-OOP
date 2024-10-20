package abstrakte_Klassen;

public abstract class Card {

    private double balance;
    private int fee;
    private String expirationDate;
    private String owner;

    public Card(double balance, int fee, String expirationDate, String owner) {
        this.balance = balance;
        this.fee = fee;
        this.expirationDate = expirationDate;
        this.owner = owner;
    }

    protected double getBalance(){
        return balance;
    }
    protected int getFee(){
        return fee;
    }
    protected String getExpirationDate(){
        return expirationDate;
    }
    protected String getOwner(){
        return owner;
    }
    protected void setBalance(double balance){
        this.balance = balance;
    }

    protected abstract void spendMoney(double amount);

}
package abstrakte_Klassen;

public class UI {
    public static void main(String[] args) {
        DebitCard dbc = new DebitCard(10000, 5, "06-2025", "Tim Marlétaz", 150);
        System.out.println("\n" + dbc.getOwner());
        dbc.spendMoney(9500);
        System.out.println(dbc.getBalance());
        dbc.setDailyLimit(10000);
        dbc.spendMoney(9500);
        System.out.println(dbc.getBalance());

        CreditCard cc = new CreditCard(5000, 10, "01-2027", "Ramon Hufschmid", 1000);
        System.out.println("\n" + cc.getOwner());
        System.out.println(cc.getCreditLimit());
        cc.spendMoney(6000);
        System.out.println(cc.getBalance());
        cc.setCreditLimit(5000);
        cc.spendMoney(5000);
        cc.setBalance(10000);
        System.out.println(cc.getBalance());

        PrepaidCard pc = new PrepaidCard(1000, 0, "05-2025", "Noam Schmidiger", 1000);
        System.out.println("\n" + pc.getOwner());
        pc.spendMoney(5000);
        System.out.println(pc.getBalance());
        System.out.println(pc.getMaxAmount());
        pc.spendMoney(500);
        System.out.println(pc.getBalance());

    }
}

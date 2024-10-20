package Interface;

public class Dagger implements Weapon {

    @Override
    public int use(int ap){
        int halfAp = (ap/2);
        int damage1 = (int) (Math.random() * (halfAp));
        int damage2 = (int) (Math.random() * (halfAp));
        return damage1 + damage2;
    }
}

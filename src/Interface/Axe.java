package Interface;

public class Axe implements Weapon{

    @Override
    public int use(int ap) {
        return (int) (Math.random() * (ap));
    }
}

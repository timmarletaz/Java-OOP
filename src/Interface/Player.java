package Interface;

public class Player {
    private String name;
    private int hp = 100;
    private int attackPoints = 20;
    private Weapon weapon;

    public Player(String name) {
        this.name = name;
        this.weapon = new Axe();
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    private void setHp(int sum){
        this.hp = sum;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void attack(Player enemy, Player attacker){
        int damage = this.weapon.use(this.attackPoints);
        int enemyHp = enemy.getHp();
        if ((enemyHp - damage) < 0){
            enemy.setHp(0);
        }else{
            enemy.setHp(enemy.getHp() - damage);
        }
        if (damage > 0){
            System.out.println("Spieler " + attacker.getName() + " hat Spieler " + enemy.getName() + " mit einem Schlag von " + damage + " Schadenspunkten getroffen");
        }else{
            System.out.println("Spieler " + enemy.getName() + " ist dem Schlag von Spieler " + attacker.getName() + " ausgewichen");
        }
        System.out.println("Neue Lebenspunkte von " + enemy.getName() + " :" + enemy.getHp());
    }


}

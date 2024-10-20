package Interface;

import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players = new ArrayList<>();

    public void start(){
        int i = 1;
        while (players.get(0).getHp() > 0 && players.get(1).getHp() > 0){
            players.get((i+1)%2).attack(players.get(i%2), players.get((i+1)%2));
            i++;
            System.out.println("\n");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        if (players.getFirst().getHp() == 0){
            System.out.println("\nHerzlichen Glückwunsch " + players.get(1).getName() + ", Sie haben das Spiel gewonnen");
        }else{
            System.out.println("\nHerzlichen Glückwunsch " + players.get(0).getName() + ", Sie haben das Spiel gewonnen");
        }
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }
}

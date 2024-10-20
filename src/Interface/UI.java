package Interface;
import java.util.Scanner;

public class UI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Game game = new Game();
        System.out.print("Name des ersten Spielers: ");
        String player1 = sc.next();

        System.out.print("Name des zweiten Spielers: ");
        String player2 = sc.next();

        game.addPlayer(new Player(player1));
        game.addPlayer(new Player(player2));

        game.start();

    }
}

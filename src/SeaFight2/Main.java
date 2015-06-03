package SeaFight2;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Гена on 31.05.2015.
 */
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hi! Print you name: ");
        Scanner s = new Scanner(System.in);
        String playerName = s.nextLine();
        System.out.printf("Hi " + playerName + "!\nCreated ships...");
        Player[] players = {new Player(playerName), new Player("Computer")};
        System.out.println("all ships is created");
        for (Player p : players)
            printField(10, 10, p.getName());
        Random rnd = new Random();
        System.out.println("And winner is" + players[rnd.nextInt(2)].getName());
    }

    private static void printField(int wigth, int height, String plaer){
        if(wigth > 26){
            System.out.println("Requested field with wight > 26 (" + wigth + "entered");
            return;
        }
        System.out.println(plaer);
        System.out.printf("    ");
        for (char letter = 'A'; letter < 'A' + wigth; ++letter){
            System.out.printf(letter + " ");
        }
        System.out.printf("\n");
        for (int i = 0; i < height; ++i){
            System.out.printf("".format("%2d |", i + 1));
            for (int j = 0; j < wigth; j++) {
                System.out.printf("_|");
            }
            System.out.println();
        }
        System.out.println();
    }
}

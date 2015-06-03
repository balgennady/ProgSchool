package SeaFightTest;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Гена on 01.06.2015.
 */

public class Main {

    public static void main(String[] args) {
        String playerName = getPlayerName();
        Player[] players = getShip(playerName);

        for (Player p : players)
            printField(10, 10, p.getName());
        Random rnd = new Random();
        System.out.println("And winner is" + players[rnd.nextInt(2)].getName());
    }

    private static Player[] getShip(String playerName) {
        Player[] players = {new Player(playerName), new Player("Computer")};
        System.out.println("all ships is created");
        return players;
    }

    private static String getPlayerName() {
        System.out.printf("Hi! Print you name: ");
        Scanner s = new Scanner(System.in);
        String playerName = s.nextLine();
        System.out.printf("Hi " + playerName + "!\nCreated ships...");
        return playerName;
    }

    private static void printField(int width, int height, String plaer){

        if(width > 26){
            System.out.println("Requested field with width > 26 (" + width + "entered");
            return;
        }

        System.out.println(plaer);
        System.out.printf("    ");
        for (char letter = 'A'; letter < 'A' + width; ++letter){
            System.out.printf(letter + " ");
        }
        System.out.print("\n    ");
        for (int i = 0; i < width; i++) {
            System.out.print("_ ");
        }
        System.out.println("");
        for (int i = 0; i < height; ++i){
            System.out.printf("".format("%2d |", i + 1)); //todo %2d», где d означает вывод десятичного целого числа
            for (int j = 0; j < width; j++) {
                System.out.printf("_|");
            }
            System.out.println();
        }
        System.out.println();
    }
}


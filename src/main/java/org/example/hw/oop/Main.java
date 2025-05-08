package org.example.hw.oop;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Orc", 27, 0.7);
        Player player2 = new Player("Elf", 20, 1.0);
        Player player3 = new Player("Drawf", 23, 0.5);
        Player player4 = new Player("Human", 20, 0.7);
        Player player5 = new Player("Demon", 29, 0.75);
        Player player6 = new Player("HalfOrc", 25, 0.65);
        Player player7 = new Player("Paladin", 29, 0.85);
        Player[] players = {player1, player2, player3, player4, player5, player7};

        player1.helloOtherPlayers(player3);

        int mostStrength = 0;
        Player mostStrengthPlayer = null;
        for (Player player : players) {
            if (player.getStrength() > mostStrength){
                mostStrength = player.getStrength();
            }
        }
        System.out.println("Most strength player:");
        for (Player player : players) {
            if (player.getStrength() == mostStrength) System.out.println(player);
        }


        player3.playerInArray(players);
        player6.playerInArray(players);

    }
}

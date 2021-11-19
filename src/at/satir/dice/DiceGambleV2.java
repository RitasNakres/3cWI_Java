package at.satir.dice;

import java.util.Random;
import java.util.Scanner;

public class DiceGambleV2 {
    public static void main(String[] args) {

        boolean game = true;
        int diceNumberPlayer;
        int diceNumberCom;
        int loop = 0;
        int sumOfDicesPlayer = 0;
        int sumOfDicesComputer = 0;


        while (game) {
            System.out.println();
            System.out.println("Wähle Sie aus den unten genannten Optionen:");
            String[] optionen = {"1. Start", "2. Finish"};
            for (String i : optionen) {
                System.out.println(i);
            }

            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();

            if (selection == 1)
                while (loop < 6) {
                    Random dicePlayer = new Random();
                    diceNumberPlayer = dicePlayer.nextInt(6) + 1;
                    sumOfDicesPlayer += diceNumberPlayer;
                    System.out.println();
                    System.out.println("Sie haben " + diceNumberPlayer + " gewürfelt");
                    System.out.println();
                    System.out.println("Der Computer würfelt!");
                    Random diceCom = new Random();
                    diceNumberCom = diceCom.nextInt(6) + 1;
                    sumOfDicesComputer += diceNumberCom;
                    System.out.println();
                    System.out.println("Der Computer hat " + diceNumberCom + " gewürfelt");
                    System.out.println();
                    loop++;
                }

            if (selection == 2) {
                game = false;
                System.out.println();
                System.out.println("Game is stopping");
                System.out.println();
            }

            System.out.println("Summe des Spielers:" + sumOfDicesPlayer);
            System.out.println("Summe des Computer:" + sumOfDicesComputer);

            if (sumOfDicesPlayer > sumOfDicesComputer) {
                System.out.println();
                System.out.println("You Won");
            } else if (sumOfDicesPlayer < sumOfDicesComputer) {
                System.out.println();
                System.out.println("You Lost");
            } else if (sumOfDicesPlayer == sumOfDicesComputer) {
                System.out.println("Draw");
            }


        }
    }
}




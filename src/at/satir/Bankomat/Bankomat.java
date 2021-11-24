package at.satir.Bankomat;

import java.util.Scanner;

public class Bankomat {

    public static void main(String[] args) {
        boolean isFinished = true;
        double accountBalance = 0;
        double withdraw = 0;


        while(isFinished) {
            System.out.println();
            System.out.println("Wähle Sie aus den unten genannten Optionen:");
            String[] optionen = new String[]{"1. Einzahlen", "2. Abheben", "3. Kontostand", "4. Ende"};
            String[] auswahl = optionen;
            int selection = optionen.length;

            for(int var9 = 0; var9 < selection; ++var9) {
                String i = auswahl[var9];
                System.out.println(i);
            }

            Scanner scanner = new Scanner(System.in);
            selection = scanner.nextInt();
            if (selection == 1) {
                System.out.println("Geben sie den Betrag an den Sie einzahlen möchten.");
                accountBalance += scanner.nextInt();
                System.out.println("Sie haben " + accountBalance + "€ eingezahlt");
            }

            if (selection == 2) {
                System.out.println("Wie viel würden Sie gerne abheben?");
                withdraw += scanner.nextInt();
                if (accountBalance <= withdraw) {
                    withdraw = 0;
                    System.out.println("Diese Transaktion ist nicht möglich");
                } else {
                    System.out.println("Sie haben " + withdraw + "€ abgehoben");
                    System.out.println();
                }
            }

            if (selection == 3) {
                    System.out.println("Der Kontostand beträgt");
                    System.out.println(accountBalance - withdraw + "€");
                    System.out.println();
                }

            if (selection == 4) {
                isFinished = false;
                System.out.println();
                System.out.println("Machine is stopping");
            }
        }

    }
}
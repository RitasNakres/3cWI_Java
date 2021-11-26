package at.satir.schoolchek;

import java.util.Random;
import java.util.Scanner;

public class SchoolCheck {
    public static void main(String[] args) {

        int declaration = 0;

        String[] text1 = {"Er ", "Sie "};
        String[] text2 = {"geht ", "laeuft ", "rennt ", "faehrt "};
        String[] text3 = {"nach Hause ", "zur Schule ", "ins Büro ", "zur Party "};

        Random generator = new Random();
        System.out.println();
        System.out.println("Geben sie an, wie viel random Sätze der Code generieren soll");
        Scanner scanner = new Scanner(System.in);
        declaration = scanner.nextInt();

        for (int i = 0; i < declaration; i++) {
            System.out.println();
            int wordPool1 = generator.nextInt(text1.length);
            int wordPool2 = generator.nextInt(text2.length);
            int wordPool3 = generator.nextInt(text3.length);

            StringBuilder randomSentence = new StringBuilder();

            randomSentence.append(text1[wordPool1]).append(text2[wordPool2]).append
                    (text3[wordPool3]).append(".\n");

            randomSentence.setCharAt(
                    0, Character.toUpperCase(randomSentence.charAt(0)));
            System.out.println(randomSentence.toString());
        }


    }
}
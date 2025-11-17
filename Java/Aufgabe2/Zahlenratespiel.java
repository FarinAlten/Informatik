import java.util.Scanner;

public class Zahlenratespiel {
    public static void main(String[] args) {
        int geheimzahl = (int)(Math.random() * 99 + 1); 

        Scanner scanner = new Scanner(System.in);

        boolean richtig = false;
        int versuche = 0;

        System.out.println("Willkommen zum Zahlenrate Spiel!");

        while (!richtig) {
            System.out.print("Bitte gib eine Zahl zwischen 1 und 100 ein: ");
            int tipp = scanner.nextInt();
            versuche++;

            if (tipp == geheimzahl) {
                System.out.println("Richtig geraten! Du hast " + versuche + " Versuche gebraucht.");
                richtig = true;
            } else if (tipp < geheimzahl) {
                System.out.println("Zu niedrig! Versuch es nochmal.");
            } else {
                System.out.println("Zu hoch! Versuch es nochmal.");
            }
        }

        scanner.close();
    }
}
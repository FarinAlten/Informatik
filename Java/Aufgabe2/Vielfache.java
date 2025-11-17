import java.util.Scanner;

public class Vielfache {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Gib eine Zahl ein: ");
        int input = sc.nextInt();

        for (int zahl = 1; zahl <= 10; zahl++) {
            System.out.println(input + " * " + zahl + " = " + (input * zahl));
        }

        sc.close();
    }
}
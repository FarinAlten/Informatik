import java.util.Scanner; 

public class ZahlEinlesen {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Bitte gib eine Zahl ein: ");


int zahl = sc.nextInt();


System.out.println("Du hast " + zahl + " eingegeben.");

sc.close();
}

}
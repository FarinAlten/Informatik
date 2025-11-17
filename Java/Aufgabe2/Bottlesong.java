public class Bottlesong {
public static void main(String[] args) {

int anzahlFlaschen = 10;
String wort = "bottles";

while (anzahlFlaschen > 0) {

if (anzahlFlaschen == 1) {
    wort = "bottle"; 
}
System.out.println(anzahlFlaschen + " green " + wort + ", hanging on the wall.");
System.out.println(anzahlFlaschen + " green " + wort + ", hanging on the wall.");
System.out.println("And if one green bottle should accidentally fall, ");
 anzahlFlaschen = anzahlFlaschen - 1;

if (anzahlFlaschen > 0) {
    System.out.println("there'll be " + anzahlFlaschen + " green " + wort + " hanging on the wall.");
} else {
    System.out.println("there'll be no green bottles,hanging on the wall.");
}
}
}
}
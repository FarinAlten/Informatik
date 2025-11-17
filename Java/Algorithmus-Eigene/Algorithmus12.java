public class Algorithmus12{
public static int multipliziere(int a, int b) {
    int produkt = 0;

    for (int i = 0; i < b; i++) {
        produkt = produkt + a;
    }

    return produkt;
}

public static void main(String[] args) {
    int x = 7;
    int y = 3;
    int ergebnis = multipliziere(x, y);

    System.out.println(ergebnis);
}
}
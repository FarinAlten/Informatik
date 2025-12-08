public class Array2 {

    int[] zahlen = {1, 2, 3, 4, 5};

    public static void main(String[] args) {
        Array2 array = new Array2();

        int summe = 0;
        for (int i = 0; i < array.zahlen.length; i++) {
            System.out.println(array.zahlen[i]);
            summe += array.zahlen[i];
        }

        System.out.println("Summe aller Werte: " + summe);

        int groessterWert = array.max();
        System.out.println("Maximalster Wert: " + groessterWert);
    }

    public int max() {
        int maxWert = zahlen[0];
        for (int i = 1; i < zahlen.length; i++) {
            if (zahlen[i] > maxWert) {
                maxWert = zahlen[i];
            }
        }
        return maxWert;
    }
}
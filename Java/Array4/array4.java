public class array4 {
public static void main (String[] args) {

int [] zahlen = {1, 10, 15, 20, 25, 30, 35, 40, 45, 50};

for (int i = 0; i < zahlen.length; i++) {
zahlen [i] = zahlen[i] * 2;
}
System.out.println ("Werte:") ;
for (int i = 0; i < zahlen.length; i++) {
System.out.print (zahlen [i] + " ");
        }
    }
}
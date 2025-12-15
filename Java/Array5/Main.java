public class array5{
    public static void main (String [] args){
        
        int [] zahlenreihe1  = {1, 3, 5, 7, 9,};

        int [] zahlenreihe2 = {2, 4, 6, 8, 10,};

        for (int i = 0; i < zahlenreihe1.length; i++) {
            if (zahlenreihe1[i] > zahlenreihe2[i]) {
                System.out.println("Index " + i + ": zahlenreihe1 ist größer");
}       else if (zahlenreihe2[i] > zahlenreihe1[i]) {
            System.out.println("Index " + i + ": Zahelnreihe2 ist größer");
} 
else {
    System.out.println("Beide Zahlenreihen sind gleich groß");
}
   
    }
        }
    }

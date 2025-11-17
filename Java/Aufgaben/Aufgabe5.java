public class Aufgabe5{
    public static void main(String[] args) {
        int b =15; 
        int a = 20;
        int rest = a % b; 
        
        while(b != 0){
        a = b;
        b = rest;

        System.out.println("Der ggT ist: " + a );
    }
}
}
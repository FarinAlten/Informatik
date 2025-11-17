public class Algorithmus15 {
public static void main(String[] args) {
int n = 1234;
int q = 0;
 
    while (n > 0) {
        int z = n % 10; 
        q = q + z;      
        n = n / 10;     
        System.out.println(q);
    
    }
}
}
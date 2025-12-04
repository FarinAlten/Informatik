public class game {
    public static void main(String[] args) {
        Magier newMagier = new Magier("Gandalf", 100, "Heiltrank", "Gifttrank");

        System.out.println("Name: " + newMagier.getName());
        System.out.println("Leben: " + newMagier.getLeben());

        newMagier.setLeben(80);
        System.out.println("Neues Leben: " + newMagier.getLeben());
    }
}
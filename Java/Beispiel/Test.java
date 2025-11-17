public class Test {
    public static void main(String[] args) {
        paladin meinErsterPaladin = new paladin();

        meinErsterPaladin.aendererName("Arne");
        System.out.println(meinErsterPaladin.gibName());

         meinErsterPaladin.gibLeben(120);
        System.out.println(meinErsterPaladin.gibName());
        
    }
}

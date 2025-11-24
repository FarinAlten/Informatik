public class game {
    public static void main(String[] args) {
        paladin meinErsterPaladin = new paladin();

        meinErsterPaladin.aendererName("Arne");
        System.out.println(meinErsterPaladin.gibName());

         meinErsterPaladin.gibLeben(120);
        System.out.println(meinErsterPaladin.gibName());
        

        bogenschuetze bs = new bogenschuetze("Hans", 150, 80);
            bs.aendereLeben(130);
        System.out.println(bs.lebenspunkte);
            bs.aendererName("Hans");
        System.out.println(bs.gibName());
        
    }
}
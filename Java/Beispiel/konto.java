public class konto {
    private String inhaber;
    private double kontostand;

    public konto(String pInhaber, double pKontostand) {
        inhaber = pInhaber;
        kontostand = pKontostand;
    }
 
    public String getInhaber() {
        return inhaber;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void einzahlen(double betrag) {
        kontostand += betrag;
    }

    public void abheben(double betrag) {
        if (betrag <= kontostand) {
            kontostand -= betrag;
        } else {
            System.out.println("Nicht genügend Guthaben!");
        }
    }
}
//k.setname("Max Mustermann")
//system.out.println(k.getname())

//k.kontostand(+50)
//sytsem.out.println(k.kontostand())

//system.out.println("ihr Kontostand beträgt " + k.Kontostand())
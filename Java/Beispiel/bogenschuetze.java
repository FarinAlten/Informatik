public class bogenschuetze {
  private String name;
  private int lebenspunkte;
  private int praezision; 

  public bogenschuetze(String pName, int pLebenspunkte, int praezision){ 
    name = pName;
    lebenspunkte = pLebenspunkte;
    this.praezision = praezision;
  }
   public String gibName() {
    return name;
  }

  public String getName() {
    return name; 
  }

  public int gibLeben(int i) {
        return lebenspunkte;
    }
  public void aendereLeben (int pLebenNeu) {
    lebenspunkte = pLebenNeu;
  }

public void schießen () {
    System.out.println(name + "schießt"); 
}

  public void aendererName (String pNameNeu) {
    name = pNameNeu;
  }
  
}
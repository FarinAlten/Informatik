public class baer {
  private String name;
  private int lebenspunkte;
  //private int schadenBiss; 
  //private int schadenKlaue; 

   public String gibName(){
    return name;
  }

  public int gibLeben(int i){
        return lebenspunkte;
    }
  public void aendereLeben (int pLebenNeu){
    lebenspunkte = pLebenNeu;
  }

public void schlagen () {
    System.out.println(name + "Schlägt"); 
}
public void beissen () {
    System.out.println(name + "beißt"); 
}
  public void aendererName (String pNameNeu) {
    name = pNameNeu;
  }
  
}
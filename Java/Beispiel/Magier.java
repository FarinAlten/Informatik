public class Magier {
  private String name;
  private int leben;
  private String Trank1;
  private String Trank2;
  public String Heiltrank;
  public String Gifttrank;



  public Magier() {
    name = "Gandalf";
    leben = 100;
    Trank1 = "Heiltrank";
    Trank2 = "Gifttrank";
  }

  public Magier(String pName, int pLeben, String Heiltrank, String Gifttrank) {
    name = pName;
    leben = pLeben;
    Trank1 = Heiltrank; 
    Trank2 = Gifttrank;
   }
 public void getTrank (String Heiltrank, String Gifttrank) {
   this.Gifttrank = Gifttrank;
   this.Heiltrank = Heiltrank;
  }
  public int gibLeben(int i) {
    return leben;
  }

  public void aendereLeben(int pNeuesLeben) {
    leben = pNeuesLeben;
  }

  public String gibName() {
    return name;
  }

  public void aendererName(String pNeuername) {
    name = pNeuername;
  }
}
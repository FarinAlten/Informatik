public class Magier {
  private String name;
  private int leben;
  private String Trank;


  public Magier() {
    name = "Gandalf";
    leben = 100;
    Trank = "Heiltrank";
  }

  public Magier(String pName, int pLeben, String pTrank) {
    name = pName;
    leben = pLeben;
    Trank = pTrank;
  }

  public String gibSchwert() {
    return Trank;
  }

  public void aenderSchwert(String pNeuerTrank) {
    Trank = pNeuerTrank;
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
public class paladin {
  private String name;
  private int leben;
  private String schwert;
  
  public String gibSchwert(){
    return schwert;  
    }

  public void aenderSchwert (String pNeuesSchwert)  {
    schwert = pNeuesSchwert;
  }
  public int gibLeben(int i){
        return leben;
    }
  public void aendereLeben (int pNeuesLeben){
    leben = pNeuesLeben;
  }

  public String gibName(){
    return name;
  }
  public void aendererName (String pNeuername) {
    name = pNeuername;
  }
  }
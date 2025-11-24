public class waffe {
  //private String fernkampf;
  private int staerke;
  private String bezeichnung;
  
  public waffe() {
    bezeichnung = "Schwert";
    staerke = 25;
  }
  public void aendereBezeichunung (String pBezeichnung){
    bezeichnung = pBezeichnung;
  }
  public String gibBezeichnung () {
    return bezeichnung; 
  }
  public int gibStaerke () {
    return staerke;   
  }

}
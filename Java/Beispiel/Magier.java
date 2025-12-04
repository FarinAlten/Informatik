public class Magier {
    private String name;
    private int leben;
    private String heiltrank;
    private String gifttrank;

    // Konstruktor
    public Magier(String pName, int pLeben, String pHeiltrank, String pGifttrank) {
        this.name = pName;
        this.leben = pLeben;
        this.heiltrank = pHeiltrank;
        this.gifttrank = pGifttrank;
    }

    // Tränke
    public void setTrank(String pHeiltrank, String pGifttrank) {
        this.heiltrank = pHeiltrank;
        this.gifttrank = pGifttrank;
    }

    public String getHeiltrank() {
        return heiltrank;
    }

    public String getGifttrank() {
        return gifttrank;
    }

    // Leben
    public int getLeben() {
        return leben;
    }

    public void setLeben(int pNeuesLeben) {
        this.leben = pNeuesLeben;
    }

    // Name
    public String getName() {
        return name;
    }

    public void setName(String pNeuerName) {
        this.name = pNeuerName;
    }
}
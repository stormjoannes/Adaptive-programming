package casino;

public class Gokautomaat implements Spel{
    private String Minimalespeelwaarde;
    private String Jackpot;
    private String SpelNaam;
    private String Soort;

    public Gokautomaat(String Mmsw) {
        Minimalespeelwaarde = Mmsw;
    }

    public void setJackpot(String Jp) {
        Jackpot = Jp;
    }

    public String getJackpot() {
        return Jackpot;
    }

    public String getSpelNaam() {
        return SpelNaam;
    }

    public void setSpelNaam(String SN) {
        SpelNaam = SN;
    }

    public String getSoort() {
        return Soort;
    }

    public void setSoort(String St) {
        Soort = St;
    }

    public String toString() {
        return "Gokautomaat met Spelnaam: " + Soort + "\n\tMinimale speelwaarde: "  + SpelNaam + "\n\t\tSpelsoort: " + Minimalespeelwaarde + "\n\tMet jackpot: " + Jackpot;
    }
}

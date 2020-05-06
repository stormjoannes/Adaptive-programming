package casino;

public class Goktafel implements Spel{
    private String MinimaleSpeelwaarde;
    private Integer Plekken;
    private String SpelNaam;
    private String Soort;
    private Medewerker Medewerker;

    public Goktafel(Integer Plk) {
        Plekken = Plk;
    }

    public void setMinimaleSpeelwaarde(String MmSw) {
        MinimaleSpeelwaarde = MmSw;
    }

    public String getMinimaleSpeelwaarde() {
        return MinimaleSpeelwaarde;
    }

    public void setMedewerker(Medewerker Mw) {
        Medewerker = Mw;
    }

    public Medewerker getMedewerker() {
        return Medewerker;
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
        return "Een speltafel met medewerker: " + Medewerker + "\n\tAantal plekken aan tafel: " + Plekken + "\n\tEen minimale speelwaarde van: " + MinimaleSpeelwaarde + "\n\tSpelsoort: " + Soort + "\n\t\tSpelnaam: " + SpelNaam;
    }

}

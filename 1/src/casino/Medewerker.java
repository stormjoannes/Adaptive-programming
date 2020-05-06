package casino;

public class Medewerker {
    private String MedewerkerNaam;
    private int MedewerkerLeeftijd;

    public Medewerker(String MN, int ML) {
        MedewerkerNaam = MN;
        MedewerkerLeeftijd = ML;
    }

    public String toString() {
        return MedewerkerNaam + " met leeftijd " + MedewerkerLeeftijd;
    }
}

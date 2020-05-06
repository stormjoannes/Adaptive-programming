package casino;

public class Klant {
    private String Naam;
    private Integer Leeftijd;
    private Pas Pas;

    public Klant(String Nm, Integer Lt) {
        Naam = Nm;
        Leeftijd = Lt;
    }

    public void setPas(Pas Ps) {
        Pas = Ps;
    }

    public casino.Pas getPas() {
        return Pas;
    }

    public String toString() {
        if (Leeftijd >= 18) {
            return "Klant: " + Naam + " met leeftijd " + Leeftijd + "\n\t\t" + Pas;
        } else {
            return "Klant: " + Naam + " met leeftijd " + Leeftijd + ", Niet toegelaten vanwegen minderjarige leeftijd!\n";
        }
    }
}

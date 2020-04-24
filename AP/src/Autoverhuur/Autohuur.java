package Autoverhuur;

public class Autohuur {
    private int aantalDagen;
    private Klant Klant;
    private Auto Auto;

    public void setAantalDagen(Integer aD) {
        aantalDagen = aD;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setGehuurdeAuto(Auto gA) {
        Auto = gA;
    }

    public Auto getGehuurdeAuto() { return Auto; }

    public void setHuurder(Klant k) {
        Klant = k;
    }

    public double totaalPrijs() {
        double totaalPrijs;
        double korting = 1 - (Klant.kortingsPercentage / 100);
        totaalPrijs = Auto.prijsPerDag * aantalDagen * korting;
        return totaalPrijs;
    }

    public String toString() {
        if (Auto == null || Klant == null) {
            return "\n" + "   Er is geen Auto bekend" + "\n" + "   Er is geen huurder bekend" + "\n" + "   aantal dagen: " + aantalDagen + " en dat kost 0.0";
        } else {
            return "\n" + "   Autotype: " + Auto + "\n" + "   op naam van: " + Klant + "\n" + "   aantal dagen: " + aantalDagen + " en dat kost ";
        }
    }
}
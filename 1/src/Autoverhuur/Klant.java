package Autoverhuur;

public class Klant {
    private String naam;
    double kortingsPercentage;

    public Klant(String nm) {
        this.naam = nm;
    }

    public void setKorting(double kP) {
        kortingsPercentage = kP;
    }

    public double getKorting() {
        return kortingsPercentage;
    }

    public String toString() {
        return naam + " (korting: " + kortingsPercentage + "%)";
    }
}
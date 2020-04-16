package Autoverhuur;

public class Auto {
    private String type;
    double prijsPerDag;

    public Auto(String tp, double prPd) {
        this.type = tp;
        this.prijsPerDag = prPd;
    }

    public void setPrijsPerdag(double prPd) {
        prijsPerDag = prPd;
    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    public String toString() {
        return type + " met prijs per dag: " + prijsPerDag;
    }
}
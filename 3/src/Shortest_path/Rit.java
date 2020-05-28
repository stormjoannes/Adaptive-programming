package Shortest_path;

public class Rit extends Stap {
    private int KM;

    public Rit(Node cls, int akm) {
        this.KM = akm;
        this.eind = cls;
    }

    public String toString() {
        return "afstand km: " + KM;
    }
}

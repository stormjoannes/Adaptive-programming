package casino;

public class Pas {
    private int Code;

    public Pas(int Cd) {
        Code = Cd;
    }

    public void setCode(int Cd) {
        Code = Cd;
    }

    public int getCode() {
        return Code;
    }

    @Override
    public String toString() {
        return  "De pascode is: " + Code;
    }
}

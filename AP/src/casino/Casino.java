package casino;

public class Casino {
    private String Name;
    private Goktafel Goktafel;
    private Gokautomaat Gokautomaat;
    private Klant Klant;

    public Casino(String nm) {
        Name = nm;
    }

    public void setGoktafel(Goktafel Gt) {
        Goktafel = Gt;
    }

    public void setGokautomaat(Gokautomaat Gkau) {
        Gokautomaat = Gkau;
    }


    public void setKlant(Klant Kl) {
        Klant = Kl;
    }

    public Goktafel getGoktafel() {
        return Goktafel;
    }

    public Gokautomaat getGokautomaat() {
        return Gokautomaat;
    }


    public Klant getKlant() {
        return Klant;
    }

    public String Gokautomaat() {
        if (Klant.toString().contains(", Niet toegelaten vanwegen minderjarige leeftijd!")) {
            return "Casino: " + Name + "\n \t" + Klant ;
        } else {
            return "Casino: " + Name + "\n \t" + Gokautomaat + "\n \t" + Klant + "\n";
        }
    }

    public String Goktafel() {
        if (Klant.toString().contains(", Niet toegelaten vanwegen minderjarige leeftijd!")) {
            return "Casino: " + Name + "\n \t" + Klant;
        } else {
            return "Casino: " + Name + "\n \t" + Goktafel + "\n \t" + Klant + "\n";
        }
    }

    public String Kijken() {
        if (Klant.toString().contains(", Niet toegelaten vanwegen minderjarige leeftijd!")) {
            return "Casino: " + Name + "\n \t" + Klant;
        } else {
            return "Casino: " + Name + "\n \t" + Klant + "\n \t" + "Spelsoort: Speelt momenteel nergens aan mee.";
        }
    }
}

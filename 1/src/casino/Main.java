package casino;

public class Main {
    public static void main(String[] arg)
    {
        Klant kl1 = new Klant("Marya", 19);
        Pas p1 = new Pas(456);
        kl1.setPas(p1);

        Goktafel Gkt1 = new Goktafel(6);
        Gkt1.setMinimaleSpeelwaarde("100 euro");
        Medewerker Mw1 = new Medewerker("Storm Joannes", 18);
        Gkt1.setMedewerker(Mw1);
        Gkt1.setSpelNaam("Poker");
        Gkt1.setSoort("Kaartspel");

        Casino Cs1 = new Casino("Sint Johannes");
        Cs1.setGoktafel(Gkt1);
        Cs1.setKlant(kl1);
        System.out.println(Cs1.Goktafel());


        Klant kl2 = new Klant("Charlie", 19);
        Pas p2 = new Pas(420);
        kl2.setPas(p2);

        Gokautomaat Gkau1 = new Gokautomaat("1 euro");
        Gkau1.setSpelNaam("Betchan");
        Gkau1.setSoort("hefboom");
        Gkau1.setJackpot("1.000.000 euro");

        Cs1.setGokautomaat(Gkau1);
        Cs1.setKlant(kl2);
        System.out.println(Cs1.Gokautomaat());


        Klant kl3 = new Klant("Thijme", 19);
        Pas p3 = new Pas(69);
        kl3.setPas(p3);

        Cs1.setGoktafel(Gkt1);
        Cs1.setKlant(kl3);
        System.out.println(Cs1.Goktafel());


        Klant kl4 = new Klant("Brandon", 16);
        Pas p4 = new Pas(166);
        kl4.setPas(p4);

        Goktafel Gkt2 = new Goktafel(4);
        Gkt2.setMinimaleSpeelwaarde("50 euro");
        Medewerker Mw2 = new Medewerker("Ringo Joannes", 18);
        Gkt2.setMedewerker(Mw2);
        Gkt2.setSpelNaam("Black Jack");
        Gkt2.setSoort("Kaartspel");

        Cs1.setGoktafel(Gkt2);
        Cs1.setKlant(kl4);
        System.out.println(Cs1.Goktafel());


        Klant kl5 = new Klant("Iwan", 18);
        Pas p5 = new Pas(166);
        kl5.setPas(p5);

        Cs1.setKlant(kl5);
        System.out.println(Cs1.Kijken());

    }
}
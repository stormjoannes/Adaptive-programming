package Autoverhuur;

public class Main {
    public static void main(String[] arg)
    {
        Autohuur ah1 = new Autohuur();
        System.out.println("Eerste autohuur: " + ah1.toString() + "\n");

        Klant k = new Klant("Mijnheer de Vries");
        k.setKorting(10.0);
        ah1.setHuurder(k);
        System.out.println("Eerste autohuur " + ah1.toString() + "\n");

        Auto a1 = new Auto("Peugeot 207", 50);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(4);
        System.out.println("Eerste autohuur:" + ah1.toString() + "\n");

        Autohuur ah2 = new Autohuur();
        Auto a2 = new Auto("Ferrari", 3500);
        ah2.setGehuurdeAuto(a2);
        ah2.setHuurder(k);
        ah2.setAantalDagen(1);
        System.out.println("Tweede autohuur:" + ah2.toString() + "\n");

        System.out.println("Gehuurd: " + ah1.getGehuurdeAuto());
        System.out.println("Gehuurd: " + ah2.getGehuurdeAuto());

    }
}
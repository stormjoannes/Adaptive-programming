import java.time.LocalDate;
package Gameshop;

public class Main {
    int releaseJaar1 = LocalDate.now().getYear() - 1; // 1 jaar geleden
    int releaseJaar2 = LocalDate.now().getYear() - 2; // 2 jaar geleden

    Game g1 = new Game("Just Cause 3", releaseJaar1, 49.98);
    Game g2 = new Game("Need for Speed: Rivals", releaseJaar2, 45.99);
    Game g3 = new Game("Need for Speed: Rivals", releaseJaar2, 45.99);

    Persoon p1 = new Persoon("Eric", 200);
    Persoon p2 = new Persoon("Hans", 55);
    Persoon p3 = new Persoon("Arno", 185);

    System.out.println(p1.koop(g1));
    System.out.println(p1.koop(g2));
    System.out.println(p1.koop(g3));
    System.out.println(p2.koop(g2));
    System.out.println(p2.koop(g1));
    System.out.println(p3.koop(g3));

    System.out.println(p1 + "\n" + p2 + "\n" + p3);

    System.out.println(p1.verkoop(g1, p3));
    System.out.println(p2.verkoop(g2, p3));
    System.out.println(p2.verkoop(g1, p1));

    System.out.println(p1 + "\n" + p2 + "\n" + p3);

}
package Fm2b;

import java.util.ArrayList;

public class Main {
    public static void main(String[] arg)
    {
        Fm2b.Node g0 = new Fm2b.Node("g0");
        Fm2b.Node g1 = new Fm2b.Node("g1");
        Fm2b.Node g2 = new Fm2b.Node("g2");
        Fm2b.Node g3 = new Fm2b.Node("g3");
        Fm2b.Node g4 = new Fm2b.Node("g4");
        Fm2b.Node g5 = new Fm2b.Node("g5");
        Fm2b.Node g6 = new Fm2b.Node("g6");
//        Fm2a.Node g6 = new Node("s3");

        Fm2b.Node e1 = new Fm2b.Node("eind-1");
        Fm2b.Node e2 = new Fm2b.Node("eind-2");
        Fm2b.Node e3 = new Fm2b.Node("eind-3");
        Fm2b.Node e4 = new Fm2b.Node("eind-4");
        Fm2b.Node e5 = new Fm2b.Node("eind-5");
        Fm2b.Node e6 = new Fm2b.Node("eind-6");

        g0.setFollow(g1, g2);
        g1.setFollow(g3, g4);
        g2.setFollow(g5, g6);
        g3.setFollow(g1, e1);
        g4.setFollow(e2, e3);
        g5.setFollow(e4, e5);
        g6.setFollow(e2, e6);

//        g0.getFollow(g0);
        System.out.println(g0.getFollow(g0));
    }
}
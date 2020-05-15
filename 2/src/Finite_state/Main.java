package Finite_state;

import java.util.ArrayList;

public class  Main {
    public static void main(String[] arg) {

        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");
        Node None = new Node("None");

        s0.setFollow(s1);
        s0.setFollow(s3);
        s1.setFollow(s1);
        s1.setFollow(s3);
        s2.setFollow(s0);
        s2.setFollow(s1);
        s3.setFollow(s3);
        s3.setFollow(s2);

        //input here
        ArrayList<Integer> ToDo = new ArrayList<>();
        ToDo.add(1);
        ToDo.add(1);
        ToDo.add(0);
        //till here

        System.out.println("A: " + s0.getFollow(s0, ToDo));


        Node g0 = new Node("g0");
        Node g1 = new Node("g1");
        Node g2 = new Node("g2");
        Node g3 = new Node("g3");
        Node g4 = new Node("g4");
        Node g5 = new Node("g5");
        Node g6 = new Node("g6");
        Node g7 = new Node("g7");
        Node g8 = new Node("g8");
        Node g9 = new Node("g9");

        Node e1 = new Node("eind-1");
        Node e2 = new Node("eind-2");
        Node e3 = new Node("eind-3");
        Node e4 = new Node("eind-4");
        Node e5 = new Node("eind-5");
        Node e6 = new Node("eind-6");
        Node e7 = new Node("eind-7");
        Node e8 = new Node("eind-8");
        Node e9 = new Node("eind-9");
        Node e10 = new Node("eind-10");

        g0.setFollow(g1);
        g0.setFollow(g2);
        g0.setFollow(g3);

        g1.setFollow(g4);
        g1.setFollow(g5);


        g2.setFollow(g6);
        g2.setFollow(g7);

        g3.setFollow(g8);
        g3.setFollow(g9);

        g4.setFollow(g1);
        g4.setFollow(e1);

        g5.setFollow(e2);
        g5.setFollow(e3);

        g6.setFollow(e4);
        g6.setFollow(e5);

        g7.setFollow(e6);
        g7.setFollow(e7);

        g8.setFollow(e8);
        g8.setFollow(e9);

        g9.setFollow(g3);
        g9.setFollow(e10);

        System.out.println("B: " + g0.getFollow_2(g0));
    }
}
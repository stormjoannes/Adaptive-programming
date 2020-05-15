package Finite_state;

import java.util.ArrayList;

public class  Main {
    public static void main(String[] arg) {

        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");
        Node None = new Node("None");

        s0.setFollow(s2, s1);
        s1.setFollow(s1, s2);
        s2.setFollow(None, s3);
        s3.setFollow(s3, s0);

        //input here
        ArrayList<Node> ToDo = new ArrayList<>();
        ToDo.add(s2);
        ToDo.add(s3);
        ToDo.add(s0);
        //till here

        System.out.println(s0.getFollow(s0, ToDo));


        Node g0 = new Node("g0");
        Node g1 = new Node("g1");
        Node g2 = new Node("g2");
        Node g3 = new Node("g3");
        Node g4 = new Node("g4");
        Node g5 = new Node("g5");
        Node g6 = new Node("g6");
//        Fm2a.Node g6 = new Node("s3");

        Node e1 = new Node("eind-1");
        Node e2 = new Node("eind-2");
        Node e3 = new Node("eind-3");
        Node e4 = new Node("eind-4");
        Node e5 = new Node("eind-5");
        Node e6 = new Node("eind-6");

        g0.setFollow_2(g1, g2);
        g1.setFollow_2(g3, g4);
        g2.setFollow_2(g5, g6);
        g3.setFollow_2(g1, e1);
        g4.setFollow_2(e2, e3);
        g5.setFollow_2(e4, e5);
        g6.setFollow_2(e2, e6);

//        g0.getFollow(g0);
        System.out.println(g0.getFollow_2(g0));

    }
}

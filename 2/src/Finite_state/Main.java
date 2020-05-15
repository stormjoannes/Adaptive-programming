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

    }
}

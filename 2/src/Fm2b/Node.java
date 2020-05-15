package Fm2b;

import java.util.ArrayList;

public class Node {

    private String crt;
    private Node FowA;
    private Node FowB;
    private ArrayList<Node> done_2 = new ArrayList<>();
    private ArrayList<Node> Follows_2 = new ArrayList<>();
    private ArrayList<String> str_gedaan = new ArrayList<>();

    public Node(String cr) {
        this.crt = cr;
    }

    public ArrayList<Node> getFollow_2(Node Now, ArrayList<Node> done, ArrayList<String> str_gedaan) {
        Double random = Math.random();
        done.add(Now);
        str_gedaan.add(crt);

        if (!crt.contains("eind")) {
            if (random <= 0.5) {
                Node nxt = Follows_2.get(0);
                Follows_2.get(0).getFollow_2(nxt, done, str_gedaan);
            } else {
                Node nxt = Follows_2.get(1);
                Follows_2.get(1).getFollow_2(nxt, done, str_gedaan);
            }
        } else {
            return done;
        }
        return done;
    }

    public ArrayList<String> getFollow_2(Node Now) {
        getFollow_2(Now, done_2, str_gedaan);
        return str_gedaan;
    }

    public void setFollow_2(Node flwA, Node flwB){
        this.FowA = flwA;
        this.FowB = flwB;
        Follows_2.add(FowA);
        Follows_2.add(FowB);
    }
}
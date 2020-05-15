package Fm2b;

import java.util.ArrayList;

public class Node {

    private String Current;
    private Node FollowA;
    private Node FollowB;
    private ArrayList<Node> done = new ArrayList<>();
    private ArrayList<Node> Follows = new ArrayList<>();
    private ArrayList<String> str_gedaan = new ArrayList<>();

    public Node(String cr) {
        this.Current = cr;
    }

    public ArrayList<Node> getFollow(Node Now, ArrayList<Node> done, ArrayList<String> str_gedaan) {
        Double random = Math.random();
        done.add(Now);
        str_gedaan.add(Current);

        if (!Current.contains("eind")) {
            if (random <= 0.5) {
                Node nxt = Follows.get(0);
                Follows.get(0).getFollow(nxt, done, str_gedaan);
            } else {
                Node nxt = Follows.get(1);
                Follows.get(1).getFollow(nxt, done, str_gedaan);
            }
        } else {
            return done;
        }
        return done;
    }

    public ArrayList<String> getFollow(Node Now) {
        getFollow(Now, done, str_gedaan);
        return str_gedaan;
    }

    public void setFollow(Node flwA, Node flwB){
        this.FollowA = flwA;
        this.FollowB = flwB;
        Follows.add(FollowA);
        Follows.add(FollowB);
    }
}
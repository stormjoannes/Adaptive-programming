package Fm2a;

import java.util.ArrayList;

public class Node {
    private String Current;
    private Node FollowA;
    private Node FollowB;
    private ArrayList<Node> done = new ArrayList<>();
    private ArrayList<Node> Follows = new ArrayList<>();
    private ArrayList<String> str_done = new ArrayList<>();

    public Node(String cr) {
        this.Current = cr;
    }

    public ArrayList<Node> getFollow(Node at, ArrayList<Node> ToDo, ArrayList<Node> done, ArrayList<String> str_done) {
        done.add(at);
        str_done.add(Current);
        if (ToDo.size() != 0) {
            if (!Current.contains("None")) {
                Node nxt = ToDo.get(0);
                ToDo.remove(0);
                nxt.getFollow(nxt, ToDo, done, str_done);
            } else {
                ToDo.remove(0);
                at.getFollow(at, ToDo, done, str_done);
            }
        } else {
            return done;
        }
        return done;
    }



    public ArrayList<String> getFollow(Node at, ArrayList<Node> ToDo) {
        getFollow(at, ToDo, done, str_done);
        return str_done;
    }

    public void setFollow(Node flwA, Node flwB) {
        this.FollowA = flwA;
        this.FollowB = flwB;
        Follows.add(FollowA);
        Follows.add(FollowB);
    }
}
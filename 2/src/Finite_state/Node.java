package Finite_state;

import java.util.ArrayList;

public class Node {
    private String Current;
    private Fm2a.Node FollowA;
    private Fm2a.Node FollowB;
    private ArrayList<Fm2a.Node> done = new ArrayList<>();
    private ArrayList<Fm2a.Node> Follows = new ArrayList<>();
    private ArrayList<String> str_done = new ArrayList<>();

    public Node(String cr) {
        this.Current = cr;
    }

    public ArrayList<Fm2a.Node> getFollow(Fm2a.Node at, ArrayList<Fm2a.Node> ToDo, ArrayList<Fm2a.Node> done, ArrayList<String> str_done) {
        done.add(at);
        str_done.add(Current);
        if (ToDo.size() != 0) {
            if (!Current.contains("None")) {
                Fm2a.Node nxt = ToDo.get(0);
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



    public ArrayList<String> getFollow(Fm2a.Node at, ArrayList<Fm2a.Node> ToDo) {
        getFollow(at, ToDo, done, str_done);
        return str_done;
    }

    public void setFollow(Fm2a.Node flwA, Fm2a.Node flwB) {
        this.FollowA = flwA;
        this.FollowB = flwB;
        Follows.add(FollowA);
        Follows.add(FollowB);
    }
}

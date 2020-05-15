package Finite_state;

import java.util.ArrayList;

public class Node {
    private String Current;
    private Node FollowA;
    private Node FollowB;
    private ArrayList<Node> done = new ArrayList<>();
    private ArrayList<Node> Follows = new ArrayList<>();
    private ArrayList<String> str_done = new ArrayList<>();

    private Node FowA;
    private Node FowB;
    private ArrayList<Node> done_2 = new ArrayList<>();
    private ArrayList<Node> Follows_2 = new ArrayList<>();
    private ArrayList<String> str_gedaan = new ArrayList<>();

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





    public ArrayList<Node> getFollow_2(Node Now, ArrayList<Node> done, ArrayList<String> str_gedaan) {
        Double random = Math.random();
        done.add(Now);
        str_gedaan.add(Current);
        System.out.println(Current);

        if (!Current.contains("eind")) {
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

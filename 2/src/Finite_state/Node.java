package Finite_state;

import java.util.ArrayList;
import java.util.Random;

public class Node {
    private String Current;
    private ArrayList<Node> done = new ArrayList<>();
    public ArrayList<Node> Follows = new ArrayList<>();
    private ArrayList<String> str_done = new ArrayList<>();

    private ArrayList<Node> done_2 = new ArrayList<>();
    private ArrayList<String> str_gedaan = new ArrayList<>();

    public Node(String cr) {
        this.Current = cr;
    }

    public ArrayList<Node> getFollow(Node at, ArrayList<Integer> ToDo, ArrayList<Node> done, ArrayList<String> str_done) {
        done.add(at);
        str_done.add(Current);
        if (ToDo.size() != 0) {
            if (!Current.contains("None")) {
                Node nxt = Follows.get(ToDo.get(0));
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

    public ArrayList<String> getFollow(Node at, ArrayList<Integer> ToDo) {
        getFollow(at, ToDo, done, str_done);
        return str_done;
    }

    public void setFollow(Node val_nd) {
        Follows.add(val_nd);
    }


    public ArrayList<Node> getFollow_2(Node Now, ArrayList<Node> done, ArrayList<String> str_gedaan) {
        done.add(Now);
        str_gedaan.add(Current);

        if (!Current.contains("eind")) {
            Random rand = new Random();
            int nmr = rand.nextInt(Follows.size());
            Node nxt = Follows.get(nmr);
            Follows.get(nmr).getFollow_2(nxt, done, str_gedaan);
        } else {
            return done;
        }
        return done;
    }

    public ArrayList<String> getFollow_2(Node Now) {
        getFollow_2(Now, done_2, str_gedaan);
        return str_gedaan;
    }
}
package Shortest_path;

import java.util.*;

public class Rit {
    private String rit;
    private HashMap<Rit, Integer> transitions_rit = new HashMap<>();

    public Rit(String rt) {
        rit = rt;
    }

    public void setTransitions_rit (Rit transitie, Integer km) {
        transitions_rit.put(transitie, km);
    }

    public HashMap<Rit, Integer> getTransitions_rit () {
        return transitions_rit;
    }
}

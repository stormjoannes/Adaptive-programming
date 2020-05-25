package Shortest_path;

import java.util.*;

public class Treinrit {
    private String treinrit;
    private HashMap<Treinrit, Integer> transitions_treinrit = new HashMap<>();

    public Treinrit(String trrt) {
        treinrit = trrt;
    }

    public void setTransitions_treinrit (Treinrit transitie, Integer km) {
        transitions_treinrit.put(transitie, km);
    }

    public HashMap<Treinrit, Integer> getTransitions_treinrit () {
        return transitions_treinrit;
    }
}

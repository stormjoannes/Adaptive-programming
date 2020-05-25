package Shortest_path;

import java.util.*;

public class Vlucht {
    private String vlucht;
    private HashMap<Vlucht, Integer> transitions_vlucht = new HashMap<>();

    public Vlucht(String vlt) {
        vlucht = vlt;
    }

    public void setTransitions_vlucht (Vlucht transitie, Integer km) {
        transitions_vlucht.put(transitie, km);
    }

    public HashMap<Vlucht, Integer> getTransitions_vlucht () {
        return transitions_vlucht;
    }
}

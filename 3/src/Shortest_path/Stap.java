package Shortest_path;

import java.util.HashSet;
import java.util.Set;

public class Stap {
    private Set<Rit> ritten = new HashSet<>();

    public void addNode(Rit nodeA) {
        ritten.add(nodeA);
    }

    public Set<Rit> getRitten() {
        return ritten;
    }


    //getters and setters
}

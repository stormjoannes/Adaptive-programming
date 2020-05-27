package Shortest_path;

import java.util.HashMap;

public class Node {
    private String node;
    private HashMap<Node, Integer> transitions_node = new HashMap<>();

    public Node(String nd) {
        node = nd;
    }

    public String getNode() {
        return node;
    }

    public void setTransitions_node (Node transitie, Integer km) {
        transitions_node.put(transitie, km);
    }

    public HashMap<Node, Integer> getTransitions_node () {
        return transitions_node;
    }
}

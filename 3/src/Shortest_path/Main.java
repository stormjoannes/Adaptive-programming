package Shortest_path;

import java.util.ArrayList;

public class Main {
    public static class Main {
        public static void main(String[] arg) {
            Node nodeA = new Node("A");
            Node nodeB = new Node("B");
            Node nodeC = new Node("C");
            Node nodeD = new Node("D");
            Node nodeE = new Node("E");
            Node nodeF = new Node("F");

            nodeA.addDestination(nodeB, 10);
            nodeA.addDestination(nodeC, 15);

            nodeB.addDestination(nodeD, 12);
            nodeB.addDestination(nodeF, 15);

            nodeC.addDestination(nodeE, 10);

            nodeD.addDestination(nodeE, 2);
            nodeD.addDestination(nodeF, 1);

            nodeF.addDestination(nodeE, 5);

            Graph graph = new Graph();

            graph.addNode(nodeA);
            graph.addNode(nodeB);
            graph.addNode(nodeC);
            graph.addNode(nodeD);
            graph.addNode(nodeE);
            graph.addNode(nodeF);

            graph = graph.calculateShortestPathFromSource(graph, nodeA);
            ArrayList<String> done = new ArrayList<>();
            for (Node i : nodeE.getShortestPath()) {
                done.add(i.getName());
            }
            System.out.println(done);
        }
    }
}

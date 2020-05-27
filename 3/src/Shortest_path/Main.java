package Shortest_path;

public class Main {
    public static void main(String[] arg) {
        Node r0 = new Node("A");
        Node r1 = new Node("B");
        Node r2 = new Node("C");
        Node r3 = new Node("D");
        Node r4 = new Node("E");
        Node r5 = new Node("F");

        r0.setTransitions_node(r1, 10);
        r0.setTransitions_node(r2, 15);
        r1.setTransitions_node(r3, 12);
        r1.setTransitions_node(r5, 15);
        r2.setTransitions_node(r4, 10);
        r3.setTransitions_node(r4, 2);
        r3.setTransitions_node(r5, 1);
        r5.setTransitions_node(r4, 5);

        System.out.println(r0.getTransitions_node());
//
//        Rit r0 = new Rit("A");
//        Rit r1 = new Rit("B");
//        Rit r2 = new Rit("C");
//        Rit r3 = new Rit("D");
//        Rit r4 = new Rit("E");
//        Rit r5 = new Rit("F");
//
//        r0.setTransitions_rit(r1, 10);
//        r0.setTransitions_rit(r2, 15);
//        r1.setTransitions_rit(r3, 12);
//        r1.setTransitions_rit(r5, 15);
//        r2.setTransitions_rit(r4, 10);
//        r3.setTransitions_rit(r4, 2);
//        r3.setTransitions_rit(r5, 1);
//        r5.setTransitions_rit(r4, 5);
//
//
//        Vlucht v0 = new Vlucht("A");
//        Vlucht v1 = new Vlucht("B");
//        Vlucht v2 = new Vlucht("C");
//        Vlucht v3 = new Vlucht("D");
//        Vlucht v4 = new Vlucht("E");
//        Vlucht v5 = new Vlucht("F");
//
//        v0.setTransitions_vlucht(v1, 10);
//        v0.setTransitions_vlucht(v2, 15);
//        v1.setTransitions_vlucht(v3, 12);
//        v1.setTransitions_vlucht(v5, 15);
//        v2.setTransitions_vlucht(v4, 10);
//        v3.setTransitions_vlucht(v4, 2);
//        v3.setTransitions_vlucht(v5, 1);
//        v5.setTransitions_vlucht(v4, 5);
//
//        Treinrit t0 = new Treinrit("A");
//        Treinrit t1 = new Treinrit("B");
//        Treinrit t2 = new Treinrit("C");
//        Treinrit t3 = new Treinrit("D");
//        Treinrit t4 = new Treinrit("E");
//        Treinrit t5 = new Treinrit("F");
//
//        t0.setTransitions_treinrit(t1, 10);
//        t0.setTransitions_treinrit(t2, 15);
//        t1.setTransitions_treinrit(t3, 12);
//        t1.setTransitions_treinrit(t5, 15);
//        t2.setTransitions_treinrit(t4, 10);
//        t3.setTransitions_treinrit(t4, 2);
//        t3.setTransitions_treinrit(t5, 1);
//        t5.setTransitions_treinrit(t4, 5);
//
//        System.out.println(r0.getTransitions_rit());
//        System.out.println(v0.getTransitions_vlucht());
//        System.out.println(t0.getTransitions_treinrit());
//
//        Stap stap = new Stap();
//        stap.addNode(r0);
//        stap.addNode(r1);
//        stap.addNode(r2);
//        stap.addNode(r3);
//        stap.addNode(r4);
//        stap.addNode(r5);
//
//        System.out.println("");
//        System.out.println(stap.getRitten());
    }
}
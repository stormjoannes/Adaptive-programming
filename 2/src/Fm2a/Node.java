package Fm2a;

public class Node {
    private String Current;
    private String FollowA;
    private String FollowB;

    public Node(String cr) {
        this.Current = cr;
    }

    public String getFollow(String Letter) {
        if (Letter.equals("A")) {
            return FollowA;
        }
        else if (Letter.equals("B")) {
            return FollowB;
        }
        else {
            return "None";
        }
    }

    public void setFollow(String flwA, String flwB) {
        this.FollowA = flwA;
        this.FollowB = flwB;
    }
}
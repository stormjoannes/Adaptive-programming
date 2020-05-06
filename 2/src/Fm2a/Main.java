package Fm2a;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("het woord: ");
        String woord = in.nextLine();

        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");
        ArrayList<String> done = new ArrayList<String>();

        s0.setFollow("s2", "s1");
        s1.setFollow("s1", "s2");
        s2.setFollow("none", "s3");
        s3.setFollow("s3", "s0");

        done.add("s0");
        String nxt = "s0";
        for (String i : woord.split("")) {
            switch (nxt) {
                case "s0":
                    if (!s0.getFollow(i).equals("None")) {
                        nxt = s0.getFollow(i);
                    }
                    done.add(s0.getFollow(i));
                    break;
                case "s1":
                    if (!s1.getFollow(i).equals("None")) {
                        nxt = s1.getFollow(i);
                    }
                    done.add(s1.getFollow(i));
                    break;
                case "s2":
                    if (!s2.getFollow(i).equals("None")) {
                        nxt = s2.getFollow(i);
                    }
                    done.add(s2.getFollow(i));
                    break;
                case "s3":
                    if (!s3.getFollow(i).equals("None")) {
                        nxt = s3.getFollow(i);
                    }
                    done.add(s3.getFollow(i));
                    break;
            }
        }
        System.out.println(done);
        if (done.get(done.size() - 1) == "none") {
            System.out.println("Deze route kan niet worden uitgevoerd in deze fase");
        }
    }
}
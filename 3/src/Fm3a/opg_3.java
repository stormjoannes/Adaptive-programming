package Fm3a;

import java.util.ArrayList;
import java.util.Random;

public class opg_3 {
    private ArrayList<Character> alfabet = new ArrayList<>();
    private ArrayList<Character> rand_char = new ArrayList<>();
    private ArrayList<Character> geordend = new ArrayList<>();

    public ArrayList<Character> make_alfabet() {
        for (char c = 'a'; c <= 'z'; c++) {
            alfabet.add(c);
        }
        return alfabet;
    }

    public ArrayList<Character> rand_gen() {
        Random rand = new Random();
        int lengte_rand_list = rand.nextInt(alfabet.size());
        while (lengte_rand_list < 2) {
            lengte_rand_list = rand.nextInt(alfabet.size());
        }
        for (int i = 0; i < lengte_rand_list; i++) {
            int rand_letter_ind = rand.nextInt(alfabet.size());
            while (rand_char.contains(alfabet.get(rand_letter_ind))) {
                rand_letter_ind = rand.nextInt(alfabet.size());
            }
            rand_char.add(alfabet.get(rand_letter_ind));
        }
        return rand_char;
    }

    public ArrayList<Character> getSorted() {
        make_alfabet();
        rand_gen();
        System.out.println("Originele lijst: " + rand_char);
        int ind = -1;
        while (rand_char.size() > 0) {
            ind += 1;
            for (int d = 0; d < rand_char.size(); d++) {
                if (rand_char.get(d) == alfabet.get(ind)) {
                    geordend.add(rand_char.get(d));
                    rand_char.remove(rand_char.get(d));
                    break;
                }
            }
        }
        return geordend;
    }
}

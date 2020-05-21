package Fm3a;

import java.util.*;

public class opg_1 {
    private ArrayList<Character> alfabet = new ArrayList<>();
    private ArrayList<Character> rand_char = new ArrayList<>();

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
        for (int x = 0; x < rand_char.size(); x++) {
            for (int d = 1; d < rand_char.size(); d++) {
                if (rand_char.get(d - 1) > rand_char.get(d)) {
                    Collections.swap(rand_char, d - 1, d);
                }
            }
        }
        return rand_char;
    }
}

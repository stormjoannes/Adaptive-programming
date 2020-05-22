package Fm3a;

import java.util.ArrayList;
import java.util.Random;

public class opg_2 {
    private ArrayList<Character> alfabet = new ArrayList<>();
    private String rand_word;
    private ArrayList<Character> rand_char = new ArrayList<>();

    public ArrayList<Character> make_alfabet() {
        for (char c = 'a'; c <= 'z'; c++) {
            alfabet.add(c);
        }
        return alfabet;
    }

    public String rand_gen() {
        rand_word = "";
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
            rand_word = rand_word + alfabet.get(rand_letter_ind);
        }
        return rand_word;
    }

    public String getSorted() {
        make_alfabet();
        rand_gen();
        System.out.println("Originele string: " + rand_word);
        for (int x = 0; x < rand_word.length(); x++) {
            for (int d = 1; d < rand_word.length(); d++) {
                if (rand_word.charAt(d - 1) > rand_word.charAt(d)) {
                    rand_word = swap(rand_word, d-1, d);
                }
            }
        }
        return rand_word;
    }

    public String swap(String s, int i0, int i1) {
        String s1 = s.substring(0, i0);
        String s2 = s.substring(i0+1, i1);
        String s3 = s.substring(i1+1);
        return s1+s.charAt(i1)+s2+s.charAt(i0)+s3;
    }
}

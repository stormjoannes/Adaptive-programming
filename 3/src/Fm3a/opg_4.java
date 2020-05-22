package Fm3a;

import java.util.ArrayList;
import java.util.Random;

public class opg_4 {
    private ArrayList<Character> alfabet = new ArrayList<>();
    private ArrayList<Integer> getallen = new ArrayList<>();

    private String rand_word;
    private ArrayList<Character> rand_char = new ArrayList<>();

    public ArrayList<Character> make_alfabet() {
        for (char c = 'a'; c <= 'z'; c++) {
            alfabet.add(c);
        }
        return alfabet;
    }

    public ArrayList<Integer> make_getallen() {
        for (int h = 0; h < 26; h++) {
            getallen.add(h);
        }
        return getallen;
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
            char side = alfabet.get(rand_letter_ind);
            String tostring = String.valueOf(side);
            while (rand_word.contains(tostring)) {
                rand_letter_ind = rand.nextInt(alfabet.size());
                tostring = String.valueOf(alfabet.get(rand_letter_ind));
            }
            rand_word = rand_word + tostring;

            int rand_getal_ind = rand.nextInt(getallen.size());
            int temp = getallen.get(rand_getal_ind);
            tostring = String.valueOf(temp);
            while (rand_word.contains(tostring)) {
                rand_getal_ind = rand.nextInt(getallen.size());
                tostring = String.valueOf(getallen.get(rand_getal_ind));
            }
            rand_word = rand_word + tostring;
        }
        return rand_word;
    }

    public String getSorted() {
        make_alfabet();
        make_getallen();
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

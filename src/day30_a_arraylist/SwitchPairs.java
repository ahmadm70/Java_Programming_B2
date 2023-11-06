package day30_a_arraylist;

import java.util.*;

public class SwitchPairs {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("cat", "in", "the", "hat"));
        for (int i = 0; i < words.size(); i += 2) {
            Collections.swap(words, i, i + 1);
        }
        System.out.println(words);
    }
}
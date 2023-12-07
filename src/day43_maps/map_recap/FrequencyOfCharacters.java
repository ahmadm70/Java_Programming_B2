package day43_maps.map_recap;

import java.util.*;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        frequency("apple");
    }
    public static void frequency(String word) {
        Map<Character, Integer> counter = new LinkedHashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char each = word.charAt(i);
            if (!counter.containsKey(each)) {
                counter.put(each, 1);
            } else {        //If we have same letter, it'll update the value by + 1
                counter.put(each, counter.get(each) + 1);
            }
        }
        System.out.println(counter);
    }
}
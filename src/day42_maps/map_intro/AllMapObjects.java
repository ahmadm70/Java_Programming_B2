package day42_maps.map_intro;

import java.util.*;

public class AllMapObjects {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        //Order is RANDOM, key can be null
        map1.put("feyruz", "java");
        map1.put("nadir", "selenium");
        map1.put("tom", "jerry");
        map1.put("mickey", "mouse");
        map1.put(null, "nothing");
        System.out.println(map1);
        Map<String, String> map2 = new LinkedHashMap<>();
        //Insertion order is being followed, key can be null
        map2.put("feyruz", "java");
        map2.put("nadir", "selenium");
        map2.put("tom", "jerry");
        map2.put("mickey", "mouse");
        map2.put(null, "nothing");
        System.out.println(map2);
        Map<String, String> map3 = new TreeMap<>();
        //Sorted order is being followed, key CAN'T be null, but value CAN
        map3.put("feyruz", "java");
        map3.put("nadir", "selenium");
        map3.put("tom", "jerry");
        map3.put("mickey", "mouse");
        //map3.put(null, "nothing");
        System.out.println(map3);
        Map<String, String> map4 = new Hashtable<>();
        //Order is random, neither key nor value can be NULL (NullPointerException), thread safe
        map4.put("feyruz", "java");
        map4.put("nadir", "selenium");
        map4.put("tom", "jerry");
        map4.put("mickey", "mouse");
        //map4.put(null, "nothing");
        System.out.println(map4);
    }
}
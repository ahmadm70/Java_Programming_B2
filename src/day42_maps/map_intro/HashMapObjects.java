package day42_maps.map_intro;

import java.util.*;

public class HashMapObjects {
    public static void main(String[] args) {
        Map<Integer, Integer> map1 = new HashMap<>();
        map1.put(1, 1);
        map1.put(2, 400);
        System.out.println(map1);
        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "one");
        map2.put(3, "three");
        map2.put(-2, "negative two");
        map2.put(10, "ten");
        map2.put(5, "five");
        map2.put(null, "hello");
        System.out.println(map2);       //HashMap doesn't follow insertion, it is a random order
        //How do we read the key/value from map?   ---> Using get(KEY) method
        System.out.println(map2.get(10));
        System.out.println(map2.get(null));
        System.out.println();
        String value = map2.get(5);     //Since our value is String, we can assign it to a String variable
        System.out.println(value);
        System.out.println();
        System.out.println(map2.remove(1));     //It removes pair with the matching key and returns the value
        System.out.println();
        System.out.println(map2.containsKey(1));        //It checks if given key is among the keys and returns boolean
        System.out.println(map2.containsValue("ten"));      //It checks if given value is among the values and returns boolean
        System.out.println(map2.containsValue("Ten"));
        System.out.println(map2.containsValue("10"));
        System.out.println();
        map2.put(null, null);
        System.out.println(map2);
        map2.put(null, "HELLO");        //Keys can't be duplicated. If we use existing key, it'll update the value for that key
        map2.put(-2, "minus two");
        System.out.println(map2);
    }
}
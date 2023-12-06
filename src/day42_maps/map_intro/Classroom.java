package day42_maps.map_intro;

import java.util.*;

public class Classroom {
    public static void main(String[] args) {
        Map<Integer, Student> map = new HashMap<>();
        Student s1 = new Student("Jerry", 19, 1055);
        map.put(1, s1);
        System.out.println(map.get(1));
        map.put(2, new Student("Tom", 20, 1021));
        System.out.println(map.get(2));
        map.put(3, new Student("Mickey", 21, 1135));
        System.out.println(map.get(3));
        System.out.println();
        System.out.println(map);
        System.out.println();
        System.out.println("3rd student's name: " + map.get(3).name);        //Printing out specific variable from object
        System.out.println(map.keySet());       //Set - because keys are unique, can't be duplicated
        for (Integer each : map.keySet()) {
            System.out.println(each + ": " + map.get(each).name);
        }
        System.out.println();
        for (Integer each : map.keySet()) {
            if (map.get(each).id > 1100) {
                System.out.println(map.get(each));
            }
        }
        System.out.println();
        System.out.println(map.values());       //Returns group of values
        System.out.println();
        for (Student each : map.values()) {
            if (each.id > 1100) {
                System.out.println(each);
            }
        }
        System.out.println();
        for(Map.Entry<Integer, Student> each : map.entrySet()) {
            System.out.println(each.getKey());
            System.out.println(each.getValue());
        }
    }
}
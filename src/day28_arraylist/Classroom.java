package day28_arraylist;

import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {
        ArrayList<String> group = new ArrayList<>();
        group.add("Ahmad");
        group.add("Aslan");
        System.out.println(group);
        group.add(0, "Nihad");
        System.out.println(group);
        System.out.println(group.get(1));
        group.add("Ulvi");
        System.out.println(group);
    }
}
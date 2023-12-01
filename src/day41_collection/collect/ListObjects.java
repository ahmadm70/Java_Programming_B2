package day41_collection.collect;

import java.util.*;

public class ListObjects {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();      //List can have duplicates in it and List is ordered (has indexes)
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add(null);
        list.add("a");
        System.out.println(list);
        System.out.println(list.get(3));
        List<String> listTwo = new LinkedList<>();
        listTwo.add("a");
        listTwo.add("b");
        listTwo.add("c");
        listTwo.add("d");
        listTwo.add(null);
        listTwo.add("a");
        System.out.println(listTwo);
        System.out.println(listTwo.get(3));
        List<String> listThree = new Vector<>();
        listThree.add("a");
        listThree.add("b");
        listThree.add("c");
        listThree.add("d");
        listThree.add(null);
        listThree.add("a");
        System.out.println(listThree);
        System.out.println(listThree.get(3));
    }
}
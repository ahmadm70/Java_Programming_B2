package day28_arraylist;

import java.util.*;

public class CreateArrayList {
    public static void main(String[] args) {
        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("hello");
        listOne.add("bye");
        ArrayList<String> listTwo = new ArrayList<>(listOne);       //adds the elements from given ArrayList to our ArrayList
        listTwo.add("salam");
        System.out.println(listOne);
        System.out.println(listTwo);
        ArrayList<String> listThree = new ArrayList<>(Arrays.asList("hello", "bye", "three"));
        System.out.println(listThree);
        listThree.set(listThree.size() - 1, listThree.get(listThree.size() - 1).toUpperCase());
        System.out.println(listThree);
    }
}
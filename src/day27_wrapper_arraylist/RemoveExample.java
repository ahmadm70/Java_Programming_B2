package day27_wrapper_arraylist;

import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("water");
        list.add("bread");
        list.add("apple");
        list.add("butter");
        System.out.println(list);
        list.add(1, "cherry");
        System.out.println(list);
        System.out.println(list.get(list.size() - 1));      //Prints out the last element in the arraylist
        System.out.println();
        list.remove(0);     //Removes the element at the given index
        System.out.println(list);
        list.remove(list.size() - 1);       //Removes the last element in the arraylist
        System.out.println(list);
        System.out.println();
        list.add("bread");
        System.out.println(list);
        System.out.println(list.remove("bread"));       //It always removes the first matching element
        System.out.println(list);
        list.remove("bread");       //Removes the specific element that given as a parameter
        System.out.println(list.remove("bread"));
        System.out.println(list);
        System.out.println();
    }
}
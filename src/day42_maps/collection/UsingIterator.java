package day42_maps.collection;

import java.util.*;

public class UsingIterator {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ahmad");
        names.add("Nihad");
        names.add("Aslan");
        names.add("Gavin");
        names.add("Ulvi");
        names.add("Caglar");
        names.add("Elturk");
        System.out.println(names);
        Iterator<String> iterator = names.iterator();
        System.out.println(iterator.next());        //Returns the next element
        //It'll give NoSuchElementException if we'll try to print out after the last element
        System.out.println();
        while (iterator.hasNext()) {        //Returns boolean, checks if there is an element after it
            System.out.println(iterator.next());        //If there is an element, returns the next element
        }       //It'll start from second element, because we already moved from first element at the above
        Iterator<String> iterator2 = names.iterator();      //It'll start from beginning again, because it's a new
    }
}
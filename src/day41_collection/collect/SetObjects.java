package day41_collection.collect;

import java.util.*;

public class SetObjects{
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();      //Set can't have duplicates in it and Set is unordered (has no indexes)
        set.add(null);
        set.add("hello");
        set.add("$4.5");
        set.add("400");
        set.add("hello");       //It won't print out this line, because it's duplicate
        set.add("%");
        System.out.println(set);
        Set<String> setTwo = new LinkedHashSet<>();
        setTwo.add(null);
        setTwo.add("hello");
        setTwo.add("$4.5");
        setTwo.add("400");
        setTwo.add("hello");
        setTwo.add("%");
        System.out.println(setTwo);
        Set<String> setThree = new TreeSet<>();     //Ordered by ascending ASCII table numbers
        //setThree.add(null);       //Doesn't allow null
        setThree.add("hello");
        setThree.add("$4.5");
        setThree.add("WORLD");
        setThree.add("400");
        setThree.add("hello");
        setThree.add("Hello");
        setThree.add("%");
        System.out.println(setThree);
    }
}
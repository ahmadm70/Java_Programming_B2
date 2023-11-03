package day29_arraylist;

import java.util.*;

public class UsingCollectionsClass {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(11, 3, -55, 0, 77, 7, 777));
        System.out.println("Original: " + list);
        Collections.sort(list);
        System.out.println("Sorted: " + list);
        Collections.reverse(list);
        System.out.println("Reversed: " + list);
        ArrayList<Character> letters = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D'));
        System.out.println("Original: " + letters);
        Collections.reverse(letters);
        System.out.println("Reversed: " + letters);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        Collections.swap(letters, 0, 3);
        System.out.println("Swapped: " + letters);
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(11, 0, 7, 11, 111, 55, 1111));
        System.out.println(numbers);
        System.out.println(Collections.frequency(numbers, 11));
    }
}
package day30_a_arraylist;

import java.util.*;

public class RemoveDuplicateNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList(Arrays.asList(1, 3, 5, 1, 4, 5, 9));
        System.out.println(noDuplicates(numbers));
    }
    public static ArrayList<Integer> noDuplicates(ArrayList<Integer> list) {
        list.removeIf(each -> Collections.frequency(list, each) > 1);
        return list;
    }
}
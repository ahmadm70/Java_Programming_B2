package day30_a_arraylist;

import java.util.*;

public class RemoveLongString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six"));
        System.out.println(modifiedList(list, 3));
    }
    public static ArrayList<String> modifiedList(ArrayList<String> list, int num) {
        list.removeIf(each -> each.length() > num);
        return list;
    }
}
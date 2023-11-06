package day30_a_arraylist;

import my_utilities.StringUtil;

import java.util.*;

public class ReverseAll {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("ted", "talk", "learn"));
        System.out.println(reverseList(list));
    }
    public static ArrayList<String> reverseList(ArrayList<String> list) {
        ArrayList<String> reversedList = new ArrayList<>();
        for (String each : list) {
            reversedList.add(StringUtil.reverse(each));
        }
        /*
        Another way to do it:
        for (int i = 0; i < list.size(); i++) {
            String reversedWord = "";
            for (int j = list.get(i).length() - 1; j >= 0 ; j--) {
                reversedWord += list.get(i).charAt(j);
            }
            reversedList.add(reversedWord);
        }
         */
        return reversedList;
    }
}
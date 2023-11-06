package day30_a_arraylist;

import java.util.*;

public class AddStringNumbers {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("123", "34", "513"));
        System.out.println(sumList(list));
    }
    public static ArrayList<Integer> sumList(ArrayList<String> list) {
        ArrayList<Integer> sumElements = new ArrayList<>();
        for (String each : list) {
            Integer sum = 0;
            for (int i = 0; i < each.length(); i++) {
                sum += Integer.parseInt(each.charAt(i) + "");
            }
            /*
            This does the exact same thing with the lines above:
            Integer sum2 = 0;
            for (String eachDigit : each.split("")) {
            sum += Integer.parseInt(eachDigit);
            }
             */
            sumElements.add(sum);
        }
        return sumElements;
    }
}
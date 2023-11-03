package day29_arraylist;

import java.util.*;

public class RemoveIfExample {
    public static void main(String[] args) {
        ArrayList<Integer> original = new ArrayList<>(Arrays.asList(1, 3, -55, 0, 77, 777, 22, 256));
        ArrayList<Integer> newList = new ArrayList<>(original);
        newList.removeIf(each -> each % 2 == 0);
        /*
        This line of code means:
        1. Loop through newList ArrayList
        2. Get each Integer element in it
        3. If element is divisible by 2, remove it
         */
        System.out.println(original);
        System.out.println(newList);
        ArrayList<Integer> newList2 = new ArrayList<>(original);
        newList2.removeIf(each -> each >= 10);
        System.out.println(newList2);
    }
}
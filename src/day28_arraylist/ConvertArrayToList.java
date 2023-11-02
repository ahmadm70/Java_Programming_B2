package day28_arraylist;

import java.util.*;

public class ConvertArrayToList {
    public static void main(String[] args) {
        Integer[] arr = {1, 3, 5, 7};       //Array can accept primitive and non-primitive data type, but ArrayList only non-primitive
        System.out.println(Arrays.toString(arr));
        Arrays.asList(arr);     //creates an ArrayList from an Array
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr));
        System.out.println(nums);
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(3, 5, 7, 9));
        System.out.println(nums2);
    }
}
package day28_arraylist;

import java.util.ArrayList;

public class IndexOfMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        nums.add(500);
        nums.add(100);
        System.out.println(nums.indexOf(100));      //returns the first matching index
        System.out.println(nums.indexOf(777));      //-1, because we don't have 777 in our ArrayList
        System.out.println(nums.lastIndexOf(100));      //returns last matching index
    }
}
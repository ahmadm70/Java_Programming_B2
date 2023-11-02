package day28_arraylist;

import java.util.ArrayList;

public class ClearMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        nums.add(500);
        System.out.println(nums);
        System.out.println(nums.size());
        System.out.println(nums.isEmpty());     //returns a boolean value
        nums.clear();       //removes all the elements inside ArrayList and makes it empty
        System.out.println(nums);
    }
}
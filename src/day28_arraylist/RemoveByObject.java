package day28_arraylist;

import java.util.ArrayList;

public class RemoveByObject {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(10);
        nums.add(400);
        nums.add(500);
        nums.add(600);
        nums.add(700);
        nums.add(800);
        nums.add(900);
        nums.add(1000);
        nums.add(10);
        System.out.println(nums);
        nums.remove(0);
        System.out.println(nums);
        nums.remove(10);
        System.out.println(nums);
        nums.remove(Integer.valueOf(10));       //We've to use non-primitive data type for removing as an object
        System.out.println(nums);
        nums.remove((Integer)200);        //Other way to cast, without using casting it'll try to remove index 200
    }
}
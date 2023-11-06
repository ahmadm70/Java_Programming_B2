package day30_a_arraylist;

import java.util.*;

public class GoodPair {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 3, 4, 5, 6, 7, 8));
        ArrayList<Integer> nums2 = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
            if (nums.get(i) >= 4) {
                nums2.add(nums.get(i));
            }
        }
        System.out.println(nums);
        System.out.println(nums2);
    }
}
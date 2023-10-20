package day23_multidimensional_arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] nums = {4, 10, 30, 100};      //Method we used below works only when array is sorted!

        System.out.println(Arrays.binarySearch(nums, 4));       //index of 0
        System.out.println(Arrays.binarySearch(nums, 10));
        System.out.println(Arrays.binarySearch(nums, 100));
        System.out.println(Arrays.binarySearch(nums, 20));      //-3, because it should be between 10 and 30, means index of 2, then we're adding 1 and making it negative
        System.out.println(Arrays.binarySearch(nums, 200));
    }
}
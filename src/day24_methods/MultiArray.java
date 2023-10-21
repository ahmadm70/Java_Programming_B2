package day24_methods;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {

        int[] nums1 = {5, 10, 20, 25};
        int[] nums2 = {5, 10, 100, 39, 19};

        int[][] all = {nums1, nums2};
        System.out.println(Arrays.deepToString(all));       //Method for printing out the 2D array
        System.out.println(Arrays.toString(all[0]));
        System.out.println(Arrays.toString(all[1]));
        System.out.println();

        int[][] multi = {
                {90, 30 ,20},
                {23, 12, 15, 456, 34, 23, 567},
                {23, 3425},
                {14}
        };

        System.out.println(multi.length);
        System.out.println(multi[0].length);
        System.out.println(multi[0][1]);
        System.out.println(Arrays.deepToString(multi));
        System.out.println(multi[3].length);
        System.out.println(multi[3][0]);
    }
}
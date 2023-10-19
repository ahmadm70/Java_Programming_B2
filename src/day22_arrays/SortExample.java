package day22_arrays;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {

        int[] num = {3, 5, 7, 15, 777, -5};
        System.out.println(Arrays.toString(num));
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
    }
}
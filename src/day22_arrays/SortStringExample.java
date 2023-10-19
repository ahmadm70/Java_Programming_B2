package day22_arrays;

import java.util.Arrays;

public class SortStringExample {
    public static void main(String[] args) {

        String[] arr = {"java", "api", "selenium", "database"};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        String[] arr2 = {"java", "api", "Selenium", "database", "77", "$Ahmad", "aPi"};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
package day24_methods;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "loop";
        String str2 = "pool";

        char[] arr1 = str1.toCharArray();       //We can use: String arr1 = str1.split(""); as well
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2));
    }
}
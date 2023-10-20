package day23_multidimensional_arrays;

import java.util.Arrays;

public class Recap {
    public static void main(String[] args) {

        int[] arr1 = {30, 90, 77, 350, 155};
        int[] arr2 = {350, 77, 90, 30, 155};
        System.out.println(arr1.length == arr2.length);
        System.out.println();
        //How can I print my array? ---> using Arrays.toString method from Arrays class from java.util package
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println();
        //How can I sort my array? ---> using Arrays.sort() method from same class and package with one above
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println();
        String[] words = {"hello", "java", "Thursday"};
        System.out.println(Arrays.toString(words));
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
    }
}
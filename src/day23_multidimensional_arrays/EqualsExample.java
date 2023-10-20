package day23_multidimensional_arrays;

import java.util.Arrays;

public class EqualsExample {
    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = a;

        System.out.println(a == b);     //They're different objects, that's why when we use arithmetic operator to compare it returns us false
        System.out.println(a == c);     //True, because c works like a shortcut, just pointing to the same location
        System.out.println(Arrays.equals(a, b));        //With Arrays.equals method we can compare the values of arrays

        int[] d = {3, 2, 1};
        System.out.println(Arrays.equals(a,d));     //This method compares elements index by index, that's why it's false
        Arrays.sort(d);
        System.out.println(Arrays.equals(a,d));
    }
}
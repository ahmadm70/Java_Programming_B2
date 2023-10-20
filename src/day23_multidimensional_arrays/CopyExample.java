package day23_multidimensional_arrays;

import java.util.Arrays;

public class CopyExample {
    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = a;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        a[0] = 100;
        a[1] = 200;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));     //b is still pointing to a, so we don't have to reassign, it does dynamically
        System.out.println();

        int[] c = Arrays.copyOf(a, a.length);       //This isn't a shortcut, it's completely new array
        System.out.println(Arrays.toString(c));

        c[0] = 500;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(c));
        System.out.println();

        int[] d = Arrays.copyOf(c, c.length + 2);
        System.out.println(Arrays.toString(d));
        System.out.println();

        int[] e = Arrays.copyOf(c, c.length - 1);
        System.out.println(Arrays.toString(e));
    }
}
package day21_arrays;

import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {

        double[] arr = new double[5];       //Here we are saying that there can be 3 elements at most
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));       //For now, it will print 0.0

        arr[0] = 9.99;      //Here we assigning value to our index number 0 container in array "arr"
        arr[1] = 14.99;
        arr[2] = 19.99;
        arr[3] = 10;
        arr[4] = -10;
        System.out.println(Arrays.toString(arr));

        arr[2] = 29.99;     //Here we are reassigning value to our index number 2
        System.out.println(Arrays.toString(arr));

        arr = new double[7];        //Here we are creating new array with 7 elements
        System.out.println(Arrays.toString(arr));

        String[] strArr = new String[5];
        System.out.println(Arrays.toString(strArr));
        /*
        null is a default value for string, like 0 for int, 0.0 for double, false for boolean
        null and emptyString aren't the same
         */

        char[] charArr = new char[]{1, 3, 5, 7};        //This is very rare type of declaration for array
    }
}
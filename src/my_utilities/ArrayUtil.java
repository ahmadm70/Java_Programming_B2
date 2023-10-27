package my_utilities;

import java.util.*;

public class ArrayUtil {
    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static int minInArray(int[] arr) {
        int min = arr[0];
        for (int eachElement : arr) {
            if (eachElement < min) {
                min = eachElement;
            }
        }
        return min;
    }
    public static int maxInArray(int[] arr) {
        int max = arr[0];
        for (int eachElement : arr) {
            if (eachElement > max) {
                max = eachElement;
            }
        }
        return max;
    }
    public static boolean containsInArray(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
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
    public static int firstMatchingIndexOfArray (int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
    public static int firstMatchingIndexOfArray (String[] arr, String str) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }
    public static int[] addElementInArray(int[] originalArray, int num) {
        int[] newArray = Arrays.copyOf(originalArray, originalArray.length + 1);
        newArray[newArray.length - 1] = num;
        return newArray;
    }
    public static String[] addElementInArray(String[] originalArray, String str) {
        String[] newArray = new String[originalArray.length + 1];
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }
        newArray[newArray.length - 1] = str;
        return newArray;
    }
}
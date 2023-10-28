package day27_wrapper_arraylist;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 2, 123, 234};
        int num = 77;
        System.out.println(Arrays.toString(addElementInArray(arr, num)));
    }
    public static int[] addElementInArray(int[] originalArray, int num) {
        int[] newArray = Arrays.copyOf(originalArray, originalArray.length + 1);
        newArray[newArray.length - 1] = num;
        return newArray;
    }
}
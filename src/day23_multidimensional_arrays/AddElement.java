package day23_multidimensional_arrays;

import java.util.*;

public class AddElement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many elements would you like to have in your array?: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter a value for index of " + i + ": ");
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = 100;
        System.out.println(Arrays.toString(newArr));
    }
}
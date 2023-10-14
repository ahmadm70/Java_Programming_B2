package day21_arrays;

public class SumElements {
    public static void main(String[] args) {

        int[] numbers = {3, 5, 7, 8};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Total sum is: " + sum);
    }
}
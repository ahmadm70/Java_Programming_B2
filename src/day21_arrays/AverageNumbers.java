package day21_arrays;

public class AverageNumbers {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 12, 45, 77, 155, 99};
        double sum = 0;

        for (int each : arr) {
            sum += each;
        }
        System.out.println("Average of your numbers is: " + sum / arr.length);
    }
}
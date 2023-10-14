package day21_arrays;

public class MaxMin {
    public static void main(String[] args) {

        int numbers[] = {3, 25, 30, 0, -55, 155, 2023, 7777};
        int min = numbers[0],
                max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            int eachElement = numbers[i];
            if (eachElement < min) {
                min = eachElement;
            } else if (eachElement > max) {
                max = eachElement;
            }
        }
        System.out.println("Min: " + min + "\nMax: " + max);
    }
}
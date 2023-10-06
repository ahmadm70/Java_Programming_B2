package day17_loops;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min = 2147483647,
                max = -2147483648,
                counter = 1;
        while (counter <= 5) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            counter++;
        }
        System.out.println("Min: " + min + "\tMax: " + max);
    }
}
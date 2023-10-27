package day26_methods;

import java.util.Scanner;

public class CountNumbers {
    public static int totalSum(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        System.out.println(totalSum(num));
    }
}
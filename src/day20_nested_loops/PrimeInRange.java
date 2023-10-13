package day20_nested_loops;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        String str = "";

        for (int i = 1; i <= num; i++) {
            int counter = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                str += i + ", ";
            }
        }
        str = str.substring(0, str.length() - 2);
        System.out.println(str);
    }
}
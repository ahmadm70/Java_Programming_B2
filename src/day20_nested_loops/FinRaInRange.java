package day20_nested_loops;

import java.util.Scanner;

public class FinRaInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        String msg = "";

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                msg = "FinRa";
            } else if (i % 3 == 0) {
                msg = "Fin";
            } else if (i % 5 == 0) {
                msg = "Ra";
            } else {
                msg = num + "";
            }
        }
        System.out.println(msg);
    }
}
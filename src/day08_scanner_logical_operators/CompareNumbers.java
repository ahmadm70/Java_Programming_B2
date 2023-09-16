package day08_scanner_logical_operators;

import java.util.Scanner;

public class CompareNumbers {
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        input.nextInt();                //It won't store the number we'll input anywhere
        System.out.println("*************************");
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();     //It will store the number we'll input in "num1" container
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();
        System.out.println("Are numbers equal? " + (num1 == num2));
    }
}

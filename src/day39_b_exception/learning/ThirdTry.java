package day39_b_exception.learning;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTry {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter number 1: ");
            num1 = input.nextInt();
            System.out.print("Enter number 1: ");
            num2 = input.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Division of number one/number two is equal to: " + num1 / num2);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {     //It'll run without a condition
            System.out.println("finally block");
        }
        System.out.println("Done");
    }
}
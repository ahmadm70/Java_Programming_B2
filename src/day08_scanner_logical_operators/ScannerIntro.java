package day08_scanner_logical_operators;

import java.util.Scanner;

public class ScannerIntro {
    public static void main (String [] args) {

        String name = "Ahmad";
        System.out.println("Hello " + name);
        System.out.println("*************************");

        Scanner input = new Scanner(System.in);     //We created a Scanner object
        System.out.println("Please enter a number: ");
        int num = input.nextInt();
        System.out.println("If I add 3 to your number, it will be: " + (num += 3));
    }
}

package day09_b_if_statements;

import java.util.Scanner;

public class Temperature {
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        double temp = input.nextDouble();

        if (temp >= 70) {
            System.out.println("It's a nice weather");
            System.out.println("Go outside, but with your laptop to code Java");
        } else {
            System.out.println("It's too cold");
            System.out.println("Stay at home and code Java");
        }
    }
}
package day25_methods;

import java.util.Scanner;

public class Age {
    public static void age(int birthYear) {
        System.out.println("Your age is: " + (2023 - birthYear));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your year of birth: ");
        int birthYear = input.nextInt();

        age(birthYear);
    }
}
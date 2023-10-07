package day18_loops;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your sentence: ");
        String msg = input.nextLine().trim();
        int spaces = 0;

        for (int i = 0; i < msg.length(); i++) {
            if (msg.charAt(i) == ' ') {
                spaces++;
            }
        }
        System.out.println("Number of spaces: " + spaces);
        System.out.println("You have " + (spaces + 1) + " words in your sentence.");
    }
}
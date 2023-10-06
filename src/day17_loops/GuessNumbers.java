package day17_loops;

import java.util.Scanner;

public class GuessNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int secretNum = 77;
        int guess = 0;
        do {
            System.out.print("Guess a number from 1 to 100: ");
            guess = input.nextInt();
            if (guess > secretNum) {
                System.out.println(guess + " is too high. Try again.");
            } else if (guess < secretNum) {
                System.out.println(guess + " is too low. Try again.");
            }
        } while (guess != secretNum);
        System.out.println("Your guess is correct!");
    }
}
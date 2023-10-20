package day17_loops;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int validPin = 1234;
        int userPin = 0000,
                attempt = 0;
        do {
            System.out.print("Enter your PIN: ");
            userPin = input.nextInt();
            attempt++;
        } while (validPin != userPin && attempt < 3);
        if (validPin == userPin) {
            System.out.println("Your Pin is correct.\n\tLoading...\n\tBalance: $777.77");
        } else {
            System.out.println("Your account blocked for 30 minutes!");
        }
    }
}
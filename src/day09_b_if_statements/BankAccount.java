package day09_b_if_statements;

import java.util.Scanner;


public class BankAccount {
    public static void main (String [] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("What is your balance? $");
        double balance = key.nextDouble();

        System.out.print("How much do you want to withdraw? $");
        double withdraw = key.nextDouble();

        balance -= withdraw;

        if (balance < 0) {
            System.out.println("Congratulations, you are broke!");
            System.out.println("Your remaining balance is: $" + balance);
        } else {
            System.out.println("Your remaining balance is: $" + balance);
        }
    }
}
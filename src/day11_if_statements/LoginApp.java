package day11_if_statements;

import java.util.Scanner;

public class LoginApp {
    public static void main (String [] args) {

        int myPin = 3737,
                mySsn = 2828;

        System.out.print("Welcome!\n\tPlease enter your 4 digit pin: ");
        Scanner input = new Scanner(System.in);
        int pin = input.nextInt();
        System.out.print("\tPlease enter last 4 digits of your SSN: ");
        int ssn = input.nextInt();
        String message = "";

        if (myPin == pin && mySsn == ssn) {
            message = "\n\tAuthentication successful!";
        } else {
            message = "\n\tAuthentication failed!";
            if (myPin != pin) {
                message = message + "\n\tIncorrect pin";
            } if (mySsn != ssn) {
                message = message + "\n\tIncorrect SSN";
            }
        }
        System.out.println(message);
    }
}
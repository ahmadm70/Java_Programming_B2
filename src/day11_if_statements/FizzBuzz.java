package day11_if_statements;

import java.util.Scanner;

public class FizzBuzz {
    public static void main (String [] args) {

        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String message = "";
        /*
        Reason we used "" is assigning default value to our variable
        Everytime machine checks our code, if it is true it reassigns the value
        If none of if statements are true, we still have a value to print: ""
         */
        if (num % 3 == 0 && num % 5 == 0) {
            message = "FizzBuzz";
        } else if (num % 3 == 0) {
            message = "Fizz";
        } else if (num % 5 == 0) {
            message = "Buzz";
        } else {
            message = num + "";
        }
        System.out.println(message);
    }
}
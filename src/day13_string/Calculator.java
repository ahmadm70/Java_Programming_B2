package day13_string;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.println("Which operator would you like to use?:\n\t+\n\t-\n\t*\n\t/\n\t%\nSelect: ");
        String operator = input.next();

        int result = 0;
        String message = "";
        boolean runOrNot = true;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            default:
                runOrNot = false;
                message = "Invalid operator!";
        }

        if (runOrNot) {
            System.out.println("You entered numbers which are " + num1 + " and " + num2 + ".\nWith the  " + operator + " operator you selected the result is: " + result);
        } else {
            System.out.println(message);
        }
    }
}
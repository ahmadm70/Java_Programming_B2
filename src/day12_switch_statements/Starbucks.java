package day12_switch_statements;

import java.util.Scanner;

public class Starbucks {
    public static void main (String [] args) {

        double price = 0;   //We are giving default value
        int calories = 0;   //It will reassign this value if statements will be true

        Scanner input = new Scanner(System.in);
        System.out.print("What size would you like?: ");
        String size = input.next();
        String message = "";

        switch (size) {
            case "tall":
                price = 2.5;
                calories = 100;
                message = "Your order for a " + size + " coffee will be $" + price + " and it will be " + calories + " calories.";
                break;
            case "grande":
                price = 4;
                calories = 150;
                message = "Your order for a " + size + " coffee will be $" + price + " and it will be " + calories + " calories.";
                break;
            case "venti":
                price = 4.5;
                calories = 200;
                message = "Your order for a " + size + " coffee will be $" + price + " and it will be " + calories + " calories.";
                break;
            default:
                message = "Sorry, we don't have that size!";
        }
        System.out.println(message);
    }
}
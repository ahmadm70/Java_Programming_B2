package day12_switch_statements;

import java.util.Scanner;

public class DayOfWeek {
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number which represents day of week (1-7): ");
        int day = input.nextInt();
        String message = "";

        switch (day) {
            case 1:
                message = "Today is Monday";
                break;
            case 2:
                message = "Today is Tuesday";
                break;
            case 3:
                message = "Today is Wednesday";
                break;
            case 4:
                message = "Today is Thursday";
                break;
            case 5:
                message = "Today is Friday";
                break;
            case 6:
            case 7:
                message = "It is weekend";
                break;
            default:
                message = "Invalid input!";
        }
        System.out.println(message);
    }
}
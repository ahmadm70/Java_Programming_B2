package day21_arrays;

import java.util.*;

public class SelectWeekDay {
    public static void main(String[] args) {

        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number that represents day of week: ");
        int num = input.nextInt();

        if (num >= 1 && num <= 7) {
            System.out.println(weekDays[num - 1]);
        } else {
            System.out.println("Invalid input!");
        }

    }
}
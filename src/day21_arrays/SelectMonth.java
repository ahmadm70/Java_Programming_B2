package day21_arrays;

import java.util.*;     //* here says that import all classes from java.util package, not only Scanner or Array separately

public class SelectMonth {
    public static void main(String[] args) {

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println(months.length);
        System.out.println(Arrays.toString(months));

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number that represents month in a year: ");
        int num = input.nextInt();

        if (num >= 1 && num <= 12) {
            System.out.println(months[num - 1]);
        } else {
            System.out.println("Invalid input!");
        }
    }
}
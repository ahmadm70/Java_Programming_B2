package day09_a_scanner;

import java.util.Scanner;

public class Revenue {
    public static void main (String [] args) {
        /*
        First, we need to import the package that has a Scanner class in it (java.util)
        Second, we need to create an OBJECT of the scanner class
         */

        Scanner input = new Scanner(System.in);
        /*
        Input is a reference to the object
        It's not variable, because "new Scanner(System.in) isn't a primitive data type, it's an object
         */
        System.out.print("Enter the price: $");
        double price = input.nextDouble();
        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        double revenue = price * quantity;
        System.out.print("Revenue is: $" + revenue);
    }
}

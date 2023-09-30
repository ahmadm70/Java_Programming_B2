package day15_string;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = input.next();
        System.out.print("Enter your last name: ");
        String lastName = input.next();
        //firstName = firstName.toUpperCase();
        //lastName = lastName.toUpperCase();

        String initial = "" + firstName.charAt(0) + lastName.charAt(0);
        //We have to use a concatenation, because without it Java takes ASCII table number for each char
        System.out.println("Your initials are: " + initial.toUpperCase());
    }
}
package day25_methods;

import java.util.Scanner;

public class Email {
    public static void email(String name, String domain) {
        System.out.println(name.charAt(0) + name.substring(name.indexOf(" ") + 1) + domain);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first and last name: ");
        String name = input.nextLine().trim().toLowerCase();
        System.out.print("Enter a domain you would like to use: ");
        String domain = input.next().trim().toLowerCase();
        email(name, domain);
    }
}
package day09_a_scanner;
import java.util.Scanner;
public class UsingNext {
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("What is today? ");
        String day = input.next();

        System.out.print("Enter your first name: ");
        String name = input.next();

        System.out.println("Today: " + day);
        System.out.println("First name: " + name);

        System.out.print("Enter your last name: ");
        String lastName = input.next();

        input.nextLine();
        System.out.print("Enter your address: ");
        String address = input.nextLine();

        System.out.print("Your bank account username: ");
        String userName = input.nextLine();

        System.out.println("Lastname: " + lastName);
        System.out.println("Address: " + address);
        System.out.println("Your bank username: " + userName);

        //We don't have to add input.nextLine only if there is nextLine written in a row
        //If there is any different kind of next and next.Line we have to handle ENTER situation
    }
}
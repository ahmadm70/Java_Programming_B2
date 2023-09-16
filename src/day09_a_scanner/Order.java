package day09_a_scanner;
import java.util.Scanner;
public class Order {
    public static void main (String [] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("Enter a product name: ");
        String product = key.nextLine();

        System.out.print("Enter a price for an " + product + " : $");
        double price = key.nextDouble();

        System.out.print("Enter a quantity: ");
        int quantity = key.nextInt();

        key.nextLine();
        System.out.print("Enter your full name: ");
        String fullName = key.nextLine();

        double totalPrice = price * quantity;

        System.out.println(fullName + ", your order for " + quantity + " lb of " + product + "s has been placed.\nYour total is: $" + totalPrice);
    }
}
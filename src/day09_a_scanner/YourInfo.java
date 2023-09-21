package day09_a_scanner;
import java.util.Scanner;
public class YourInfo {
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        byte age = input.nextByte();

        System.out.print("Enter your favourite number: ");
        long num = input.nextLong();

        input.nextLine();       //This one handles the ENTER key that comes from previous
        System.out.print("Enter your favourite book: ");
        String book = input.nextLine();

        System.out.println("I am " + age + ", my favourite number is " + num + " and my favourite book is \"" + book + "\" by Sun Tzu");
    }
}
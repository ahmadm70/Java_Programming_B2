package day17_loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String list = "Shopping List:";
        String addMore = "";
        do {
            System.out.print("Enter the name of the item: ");
            String itemName = input.nextLine();
            list = list + "\n\t" + itemName;
            System.out.print("Do you want to add something else? (yes or no): ");
            addMore = input.nextLine();
        } while (addMore.equalsIgnoreCase("yes"));
        System.out.println(list);
    }
}
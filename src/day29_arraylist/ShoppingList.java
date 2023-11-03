package day29_arraylist;

import java.util.*;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        statusOfShoppingList(shoppingList);
        askToAddItems(shoppingList);
    }
    public static void statusOfShoppingList(ArrayList<String> list) {
        if (list.isEmpty()) {
            System.out.println("Shopping list is empty!");
        } else {
            System.out.println("Shopping list has items.");
        }
    }
    public static void askToAddItems(ArrayList<String> list) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter an item to your shopping list: ");
            list.add(input.nextLine());
            System.out.print("Would you like to add more items? (true/false): ");
        } while (input.nextLine().equalsIgnoreCase("true"));
        System.out.println(list);
    }
}
package day29_arraylist;

import java.util.*;

public class Caffeine {
    public static void main(String[] args) {
        ArrayList <String> drinks = new ArrayList<>();
        System.out.println(drinks.size());
        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("energy drink");
        drinks.add("soda");
        System.out.println(drinks);
        ArrayList<String> drinks2 = new ArrayList<>(drinks);
        String[] drinksArray = {"espresso", "tea", "coca-cola", "redbull"};
        ArrayList<String> drinks3 = new ArrayList<>(Arrays.asList(drinksArray));
        ArrayList<String> drinks4 = new ArrayList<>(Arrays.asList("coffee", "tea", "coca-cola"));
        drinks.addAll(Arrays.asList("fanta", "monster", "hell"));
        System.out.println(drinks);
        drinks.addAll(0, Arrays.asList("sprite", "mountain dew"));
        System.out.println(drinks);
    }
}
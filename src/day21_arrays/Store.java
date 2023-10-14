package day21_arrays;

import java.util.Arrays;

public class Store {
    public static void main(String[] args) {

        String[] items = {"Shoes", "Pants", "Jackets", "Gloves", "AirPods"};
        boolean hasJacket = false;

        System.out.println(Arrays.toString(items).toLowerCase().contains("jackets"));
        //Here we used simple String method chaining

        for (String each : items) {
            if (each.equalsIgnoreCase("jackets")) {
                hasJacket = true;
                //If we'll use else { hasJacket = false } after line 17, then break we've to use break at line 17;
            }
        }

        if (hasJacket) {
            System.out.println("We have it at the store.");
        } else {
            System.out.println("Sorry, we don't have it.");
        }
    }
}
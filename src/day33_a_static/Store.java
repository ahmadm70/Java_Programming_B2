package day33_a_static;

import java.util.*;

public class Store {
    public static void main(String[] args) {
        Food f1 = new Food("bread", 2, 1.99);
        Food f2 = new Food("donut", 8, 2.49);
        Food f3 = new Food("apple", 8, 2.99);
        Food f4 = new Food("onion", 4, 0.29);
        Food f5 = new Food("water", 5, 5.59);
        ArrayList<Food> foods = new ArrayList<>(Arrays.asList(f1, f2, f3, f4, f5));
        for (Food each : foods) {
            System.out.println(each);
        }
        System.out.println();
        ArrayList<Food> startsWithA = new ArrayList<>(foods);
        startsWithA.removeIf(obj -> !obj.name.startsWith("a"));
        for (Food each : startsWithA) {
            System.out.println(each);
        }
        System.out.println();
        ArrayList<Food> moreThan5 = new ArrayList<>(foods);
        moreThan5.removeIf(obj -> obj.quantity < 5);
        for (Food each : moreThan5) {
            System.out.println(each);
        }
    }
}
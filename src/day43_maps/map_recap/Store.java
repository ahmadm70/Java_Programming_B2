package day43_maps.map_recap;

import java.util.*;

public class Store {
    public static void main(String[] args) {
        Map<String, Double> store = new HashMap<>();
        store.put("Water", 1.99);
        store.put("Coffee", 2.99);
        store.put("Apples", 8.99);
        store.put("Bread", 3.99);
        store.put("Banana", 1.99);
        System.out.println(store);
        //How can I get the price for apples? ---> By using get(key) method
        System.out.println(store.get("Apples") + "\n");
/*
        String[] arr = store.keySet().toArray(new String[5]);
        System.out.println(Arrays.toString(arr));
        Set<String> setOfKeys = store.keySet();
*/
        for (String each : store.keySet()) {
            System.out.print(each + ": $");
            System.out.println(store.get(each));
        }
        System.out.println(store.values());
        System.out.println();
        for (Double each : store.values()) {
            System.out.print(each + "\t");
        }
        System.out.println();
        for (Map.Entry<String, Double> each : store.entrySet()) {
            System.out.println("Item name and price (pair): " + each);
            System.out.println("Item name: " + each.getKey());
            System.out.println("Item price: $" + each.getValue());
        }
        Map<String, Double> map1 = new HashMap<>();
        map1.put("Apples", 8.99);
        Map<String, Double> map2 = new HashMap<>();
        map2.put("Water", 1.99);
        Map<String, Double> map3 = new HashMap<>();
        map3.put("Bread",3.99);
        Map<Integer, Map<String, Double>> allMaps = new HashMap<>();        //Using Map object as a value for other Map
        allMaps.put(1, map1);
        allMaps.put(2, map2);
        allMaps.put(3, map3);
        System.out.println("\n" + allMaps);
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the item you're looking for: ");
        System.out.println(store.containsKey(input.next()) ? "Item is in stock" : "Not available for now!");
    }
}
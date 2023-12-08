package day44_map_and_functions.map_recap;

import java.util.*;

public class MapSalary {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("Ahmad", 150_000.00);
        map.put("Nihad", 125_000.00);
        map.put("Mickey", 100_000.00);
        map.put("Feyruz", 200_000.00);
        map.put("Tom", 50_000.00);
        System.out.println("Info before everything: " + map);
        allTasks(map);
    }
    static void allTasks(Map<String, Double> map) {
        double maxSalary = Double.MIN_VALUE;
        String nameForMax = "";
        double minSalary = Double.MAX_VALUE;
        String nameForMin = "";
        int counter = 0;
        List<String> names = new ArrayList<>();
        for (Map.Entry<String, Double> each : map.entrySet()) {
            if (each.getValue() > maxSalary) {
                maxSalary = each.getValue();
                nameForMax = each.getKey();
            }
            if (each.getValue() < minSalary) {
                minSalary = each.getValue();
                nameForMin = each.getKey();
            }
            if (each.getValue() >= 120_000 && each.getValue() <= 200_000) {
                counter++;
            }
            if (each.getValue() <= 118_000) {
                names.add(each.getKey());
            }
            map.put(each.getKey(), each.getValue() + 20_000);
        }
        System.out.println("Maximum salary: $" + maxSalary + " - " + nameForMax);
        System.out.println("Minimum salary: $" + minSalary + " - " + nameForMin);
        System.out.println("Number of people who is making between $120,000-$200,000: " + counter);
        System.out.println("List of people who is making less than $118,000: " + names);
        System.out.println("Info after the raise: " + map);
    }
}
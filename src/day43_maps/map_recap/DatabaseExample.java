package day43_maps.map_recap;

import java.util.*;

public class DatabaseExample {
    public static void main(String[] args) {
        List<Map<String, String>> listOfPersons = new ArrayList<>();
        listOfPersons.add((createMap("Tom", "Jerry", "2")));
        listOfPersons.add((createMap("Mickey", "Mouse", "2")));
        listOfPersons.add((createMap("Winnie", "Pooh", "2")));
        listOfPersons.add((createMap("James", "Bond", "2")));
        System.out.println(listOfPersons);
        for (Map<String, String> each : listOfPersons) {
            System.out.println(each.get("First name"));     //Getting first names
            System.out.println(each);
            if (each.get("Last name").contains("e")) {      //Getting last names which has "e" in it
                System.out.println(each.get("Last name"));
            }
        }
        //Getting last name of last person in the list
        System.out.println(listOfPersons.get(listOfPersons.size() - 1).get("Last name"));
    }
    public static Map<String, String> createMap(String firstName, String lastName, String batchNumber) {
        Map<String, String> person = new HashMap<>();
        person.put("First name", firstName);
        person.put("Last name", lastName);
        person.put("Batch", batchNumber);
        return person;
    }
    public static Map<String, String> createMap(String firstName, String lastName, Integer batchNumber) {
        Map<String, String> person = new HashMap<>();
        person.put("First name", firstName);
        person.put("Last name", lastName);
        person.put("Batch", "" + batchNumber);
        return person;
    }
}
package day27_wrapper_arraylist;

import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {
        ArrayList<String> group = new ArrayList<>();
        System.out.println(group.size());
        group.add("Ahmad");
        group.add("Nihad");
        group.add("Aslan");
        group.add("Gavin");
        group.add("Ulvi");
        System.out.println(group.size());
        System.out.println(group);
        System.out.println(group.get(0));       //Prints out the first name
        System.out.println();
        //Printing out all elements with the for loop
        for (int i = 0; i < group.size(); i++) {
            System.out.println("Name " + (i + 1) + ": " + group.get(i));
        }
        //Same thing with for each loop
        for (String each : group) {
            System.out.println("Name: " + each);
        }
        for (String eachElement : group) {
            for (int i = 0; i < eachElement.length(); i++) {
                System.out.print(eachElement.charAt(i) + " ");
            }
            System.out.println();
        }
    }
}
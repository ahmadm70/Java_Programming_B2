package day30_b_custom_classes;

import java.util.*;

public class AllPeople {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer[] arr = new Integer[5];
        ArrayList<Integer> list = new ArrayList<>();
        //Lines above were the examples for object creation
        Person personOne = new Person();
        Person personTwo = new Person();
        System.out.println("Person 1: " + personOne.name);
        personOne.name = "Ahmad";
        System.out.println("Person 1: " + personOne.name);
        personOne.age = 25;
        personOne.height = 5.9;
        personOne.isMarried = true;
        System.out.println("Person 1: " + personOne.age);
        System.out.println("Person 1: " + personOne.height);
        System.out.println("Person 1: " + personOne.isMarried);
        System.out.println();
        //Every object has its OWN COPY of instance variables
        System.out.println("Person 2: " + personTwo.name);
        personTwo.name = "Nihad";
        personTwo.age = 24;
        personTwo.height = 5.10;
        personTwo.isMarried = false;
        System.out.println("Person 2: " + personTwo.name);
        System.out.println("Person 2: " + personTwo.age);
        System.out.println("Person 2: " + personTwo.height);
        System.out.println("Person 2: " + personTwo.isMarried);
    }
}
package day12_switch_statements;

import java.util.Scanner;

public class Schedule {
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What day of week is it and what is it about?: ");
        String day = input.next();
        String message = "";

        switch (day) {
            case "Monday":
                message = "No classes for now, but it'll start soon.\nIt'll be mentor sessions from 7pm to 10pm.";
                break;
            case "Tuesday":
                message = "No classes scheduled, but it is good day practicing Java by yourself.\nWe can watch Champions League at night";
                break;
            case "Wednesday":
            case "Thursday":
                message = "We are having Java classes with Feyruz.";
                break;
            case "Friday":
                message = "No classes scheduled, but I am working from 4pm to 10pm.";
                break;
            case "Saturday":
                message = "We are having Java class with Feyruz from 9am to 3pm.\nAfter that I am working again.";
                break;
            case "Sunday":
                message = "Finally FunDay! We are having soft skill class with Nadir.\nAfter class I can take a rest";
            default:
                message = "Invalid input!";
        }
        System.out.println(message);
    }
}
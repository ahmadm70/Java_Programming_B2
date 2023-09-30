package day15_string;

import java.util.Scanner;

public class Title {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an URL: ");
        String url = input.next();
        url = url.toLowerCase();
        input.nextLine();
        System.out.print("Enter your name with title: ");
        String name = input.nextLine();
        String msg = "";

        if (url.startsWith("www.") && url.endsWith(".com")) {
            msg = name + ",\nYou entered the correct URL which is: " + url + "\nLoading the webpage...";
        } else {
            msg = "Invalid URL!";
        }
        System.out.println(msg);
    }
}
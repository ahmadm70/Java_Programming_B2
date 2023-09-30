package day15_string;

import java.util.Scanner;

public class Title2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name with title: ");
        String name = input.nextLine();
        name = name.toLowerCase();
        String msg = "";

        if (name.startsWith("mr") || name.startsWith("mister")) {
            msg = "Hello sir!";
        } else if (name.startsWith("mrs") || name.startsWith("miss") || name.startsWith("madam")) {
            msg = "Hello ma'am!";
        } else if (name.startsWith("dr")) {
            msg = "Hello doctor!";
        } else if (name.endsWith(" sr")) {      //We leave a gap here, because of sr can be used in the name of someone
            msg = "Nice to meet you senior!";
        } else if (name.endsWith(" jr")) {
            msg = "Nice to meet you junior!";
        } else {
            msg = "There is no title in your name?";
        }
        System.out.println(msg);
    }
}

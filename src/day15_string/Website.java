package day15_string;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an URL: ");
        String url = input.next();

        int start = url.indexOf(".") + 1;   //startIndex is included
        int end = url.length() - 4;         //endIndex isn't included
        System.out.println(url.substring(start, end));
    }
}
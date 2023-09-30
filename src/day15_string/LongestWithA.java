package day15_string;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a first word: ");
        String word1 = input.next();
        System.out.print("Enter a second word: ");
        String word2 = input.next();
        System.out.print("Enter a third word: ");
        String word3 = input.next();
        String msg = "";

        int l1 = word1.length();
        int l2 = word2.length();
        int l3 = word3.length();

        if (word1.contains("a") && word2.contains("a") && word3.contains("a")) {
            if (l1 >= l2 && l1 >= l3) {
                msg = word1 + " is the longest word with \"a\"";
            } else if (l2 >= l1 && l2 >= l3) {

            } else if (l3 >= l1 && l3 >= l2) {
                msg = word3 + " is the longest word with \"a\"";
            }
        } else if (word1.contains("a") && word2.contains("a")) {
            if (l1 >= l2) {
                msg = word1 + " is the longest word with \"a\"";
            } else if (l2 >= l1) {
                msg = word2 + " is the longest word with \"a\"";
            }
        } else if (word1.contains("a") && word3.contains("a")) {
            if (l1 >= l3) {
                msg = word1 + " is the longest word with \"a\"";
            } else if (l3 >= l1) {
                msg = word3 + " is the longest word with \"a\"";
            }
        } else if (word2.contains("a") && word3.contains("a")) {
            if (l2 >= l3) {
                msg = word2 + " is the longest word with \"a\"";
            } else if (l3 >= l2) {
                msg = word3 + " is the longest word with \"a\"";
            }
        } else if (word1.contains("a")) {
            msg = word1 + " is the longest word with \"a\"";
        } else if (word2.contains("a")) {
            msg = word2 + " is the longest word with \"a\"";
        } else if (word3.contains("a")) {
            msg = word3 + " is the longest word with \"a\"";
        } else {
            msg = "None of your words contains \"a\"";
        }

        System.out.println(msg);
    }
}

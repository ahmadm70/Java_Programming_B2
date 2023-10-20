package day20_nested_loops;

import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your letter combination: ");
        String str1 = input.next().toUpperCase();
        String str2 = str1;
        String duplicate = "";

        for (int i = 0; i < str1.length(); i++) {
            char eachOuterLetter = str1.charAt(i);
            int counter = 0;
            if (duplicate.contains(eachOuterLetter + "")) {
                continue;
            }
            for (int j = 0; j < str2.length(); j++) {
                char eachInnerLetter = str2.charAt(j);
                if (eachOuterLetter == eachInnerLetter) {
                    counter++;
                }
            }
            if (counter > 1) {
                duplicate += eachOuterLetter;
            }
        }
        System.out.println(duplicate);
    }
}
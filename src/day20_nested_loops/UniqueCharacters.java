package day20_nested_loops;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your letter combination: ");
        String str = input.next().toUpperCase();
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char eachOuterLetter = str.charAt(i);
            int counter = 0;
            for (int j = 0; j < str.length(); j++) {
                char eachInnerLetter = str.charAt(j);
                if (eachOuterLetter == eachInnerLetter) {
                    counter++;
                }
            }
            if (counter == 1) {
                unique += eachOuterLetter;
            }
        }
        System.out.println(unique);
    }
}
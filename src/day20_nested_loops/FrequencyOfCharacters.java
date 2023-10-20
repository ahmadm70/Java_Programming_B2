package day20_nested_loops;

import java.util.Scanner;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String str = input.next().toLowerCase();
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);
            int counter = 0;
            if (!unique.contains(eachLetter + "")) {
                for (int j = 0; j < str.length(); j++) {
                    if (eachLetter == str.charAt(j)) {
                        counter++;
                    }
                }
                System.out.println(eachLetter + ": " + counter);
                unique += eachLetter;
            }
        }
        System.out.println("********************");
        //Using continue
        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);
            int counter = 0;
            if (!unique.contains(eachLetter + "")) {
                continue;
            }
            for (int j = 0; j < str.length(); j++) {
                if (eachLetter == str.charAt(j)) {
                    counter++;
                }
            }
            System.out.println(eachLetter + ": " + counter);
            unique += eachLetter;
        }
    }
} //TODO
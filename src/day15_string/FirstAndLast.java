package day15_string;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        //How you can get first and last character of the sentence?
        String first = "First character is: " + sentence.charAt(0);
        String last = "Last character is: " + sentence.charAt(sentence.length() - 1);
        System.out.println(first);
        System.out.println(last);
    }
}

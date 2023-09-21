package day10_if_statements;

public class CheckCharacter {
    public static void main (String [] args) {

        char letter = 'M';

        if (letter >= 'A' && letter <= 'Z') {
            System.out.println("My letter is uppercase: " + letter);
        }
        if (letter >= 'a' && letter <= 'z') {
            System.out.println("My letter is lowercase: " + letter);
        }
    }
}
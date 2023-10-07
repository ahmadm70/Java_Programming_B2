package day18_loops;

public class Palindrome {
    public static void main(String[] args) {

        String original = "racecar";
        String reverse = "";
        String msg = "";

        for (int i = original.length() - 1; i >= 0 ; i--) {
            reverse += original.charAt(i);
        }

        if (original.equals(reverse)) {
            msg = "Your word is a palindrome.";
        } else {
            msg = "Your word isn't a palindrome.";
        }
        System.out.println(msg);
    }
}
package day22_arrays;

import java.util.*;
public class LongestPalindrome {
    public static void main(String[] args) {

        String [] arr = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String longestPalindrome = "";

        for (int i = 0; i < arr.length; i++) {
            String eachWord = arr[i];
            String reversed = "";
            for (int j = eachWord.length() - 1; j >= 0 ; j--) {
                reversed += eachWord.charAt(j);
            }
            if (eachWord.equals(reversed)) {
                if (eachWord.length() > longestPalindrome.length()) {
                    longestPalindrome = eachWord;
                }
            }
        }
        System.out.println(longestPalindrome);
    }
}
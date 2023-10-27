package day26_methods;

import my_utilities.StringUtil;

public class UsingStringUtil {
    public static void main(String[] args) {
        System.out.println(StringUtil.frequencyOfCharacters("apple", 'p'));
        System.out.println(StringUtil.fixFormat("apple"));
        System.out.println(StringUtil.reverse("apple"));
        System.out.println("Is my word a palindrome?: " + StringUtil.isPalindrome("apple"));
        System.out.println(StringUtil.uniqueCharacters("apple"));

    }
}
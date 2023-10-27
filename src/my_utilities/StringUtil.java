package my_utilities;

public class StringUtil {
    public static int frequencyOfCharacters(String str, char character) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }
    public static String fixFormat(String str) {
        return str.toUpperCase().charAt(0) + str.substring(1).toLowerCase();
    }
    public static String reverse(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }
    public static boolean isPalindrome(String word) {
        if (word.equalsIgnoreCase(StringUtil.reverse(word))) {
            return true;
        } else {
            return false;
        }
    }
    public static String uniqueCharacters(String str) {
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
        return unique;
    }
}
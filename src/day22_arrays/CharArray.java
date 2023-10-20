package day22_arrays;

import java.util.*;
public class CharArray {
    public static void main(String[] args) {

        char[] arr = {'j', 'a', 'v', 'a'};

        for (char each : arr) {
            System.out.println(each);
        }

        String word = "java";
        char[] newArr = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            newArr[i] = word.charAt(i);
        }

        char[] charArr = word.toCharArray();        //This method does exact same thing with the one above
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(charArr));

        char[] day = {'m', 'o', 'n', 'd', 'a', 'y'};
        String dayString = "";
        for (char each : day) {
            dayString += each;
        }
        System.out.println(dayString);

        String dayStr = new String(day);
        System.out.println(dayStr);
    }
}
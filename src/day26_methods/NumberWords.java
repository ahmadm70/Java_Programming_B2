package day26_methods;

public class NumberWords {
    public static String numberAsWord(int num) {
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        return words[num];      //If we start our array from 0, we have to change this line to ---> words[num] - 1
    }
    public static void main(String[] args) {
        System.out.println(numberAsWord(7));
    }
}
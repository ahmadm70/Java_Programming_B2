package day22_arrays;

public class ReverseMiddleWord {
    public static void main(String[] args) {

        String str = "Java always fun.";
        String[] words = str.split(" ");
        String reverse = "";
        for (int i = words[1].length() - 1; i >= 0 ; i--) {
            reverse += words[1].charAt(i);
        }
        System.out.println(reverse);
    }
}
package day22_arrays;

public class ReverseSentence {
    public static void main(String[] args) {

        String sentence = "today is java";
        String[] str = sentence.split(" ");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        System.out.println();

        String result = "";
        for (int i = str.length - 1; i >= 0 ; i--) {
            result += str[i] + " ";
        }
        System.out.println(result.trim());
    }
}
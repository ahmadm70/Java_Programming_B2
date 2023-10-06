package day17_loops;

public class PrintEachChar {
    public static void main(String[] args) {

        String str = "loopcamp";
        for (int i = 0; i < str.length(); i++) {    //or, i <= str.length() - 1;
            System.out.println(str.charAt(i));
        }
    }
}
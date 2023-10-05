package day16_loops;

public class MiddleChar {
    public static void main(String[] args) {

        String str = "abcdef";
        int mid = str.length() / 2;

        if (str.length() % 2 == 0) {
            char firstMiddleChar = str.charAt(mid - 1);
            char secondMiddleChar = str.charAt(mid);
            System.out.println("Middle chars: " + firstMiddleChar + secondMiddleChar);
        } else {
            System.out.println(mid);
        }
    }
}